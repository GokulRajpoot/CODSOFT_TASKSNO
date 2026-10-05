package com.codsoft;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class QuizManager {
    private static final int TIME_LIMIT = 15;

    private final List<Question> questions;

    public QuizManager(List<Question> questions) {
        this.questions = questions;
    }

    public void start() {
        QuizResult result = new QuizResult(questions.size());

        printWelcome();

        try (TimedInputReader reader = new TimedInputReader()) {
            for (int i = 0; i < questions.size(); i++) {
                Question q = questions.get(i);
                q.display(i + 1, questions.size());
                System.out.println("Time limit: " + TIME_LIMIT + " seconds");
                System.out.print("Your answer: ");

                try {
                    String answer = reader.read(TIME_LIMIT);

                    if (answer.matches("[A-D]") && q.isCorrect(answer.charAt(0))) {
                        System.out.println("Correct answer!");
                        result.recordCorrect(i, answer);
                    } else {
                        System.out.println(answer.matches("[A-D]")
                                ? "Incorrect answer!" : "Invalid answer!");
                        result.recordIncorrect(i, answer);
                    }
                } catch (TimeoutException e) {
                    System.out.println("\nTime's up!");
                    result.markUnansweredFrom(i);
                    break;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Quiz interrupted.");
                    break;
                } catch (ExecutionException e) {
                    System.out.println("Unable to read your answer.");
                    result.markUnansweredFrom(i);
                    break;
                }
            }
        }

        result.print(questions);
    }

    private void printWelcome() {
        System.out.println("=================================");
        System.out.println("       JAVA QUIZ APPLICATION");
        System.out.println("=================================");
        System.out.println("Each question has " + TIME_LIMIT + " seconds.");
        System.out.println("Enter A, B, C, or D to answer.");
    }
}
