package com.codsoft;

import java.util.List;

public class QuizResult {
    private final int total;
    private final String[] userAnswers;
    private int correct, incorrect, unanswered;

    public QuizResult(int total) {
        this.total = total;
        this.userAnswers = new String[total];
    }

    public void recordCorrect(int index, String answer) {
        userAnswers[index] = answer;
        correct++;
    }

    public void recordIncorrect(int index, String answer) {
        userAnswers[index] = answer;
        incorrect++;
    }

    public void markUnansweredFrom(int index) {
        unanswered += total - index;
    }

    public void print(List<Question> questions) {
        System.out.println("\n=================================");
        System.out.println("           QUIZ RESULT");
        System.out.println("=================================");
        System.out.println("Total Questions : " + total);
        System.out.println("Correct Answers : " + correct);
        System.out.println("Incorrect       : " + incorrect);
        System.out.println("Unanswered      : " + unanswered);
        System.out.println("Final Score     : " + correct + " / " + total);

        System.out.println("\nAnswer Summary:");
        for (int i = 0; i < total; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions.get(i).getText());
            System.out.println("Your answer: "
                    + (userAnswers[i] == null ? "Not answered" : userAnswers[i]));
            System.out.println("Correct answer: " + questions.get(i).getCorrectAnswer());
        }
        System.out.println("\nThank you for taking the quiz!");
    }
}
