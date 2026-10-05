package com.codsoft;

import java.util.*;

public class Question {
    private final String text;
    private final String[] options;
    private final char correctAnswer;

    public Question(String text, String[] options, char correctAnswer) {
        this.text = text;

        String correctText = options[correctAnswer - 'A'];
        List<String> shuffled = new ArrayList<>(Arrays.asList(options));
        Collections.shuffle(shuffled);

        this.options = shuffled.toArray(new String[0]);
        this.correctAnswer = (char) ('A' + shuffled.indexOf(correctText));
    }

    public String getText() { return text; }
    public char getCorrectAnswer() { return correctAnswer; }

    public boolean isCorrect(char answer) {
        return answer == correctAnswer;
    }

    public void display(int number, int total) {
        System.out.println("\n---------------------------------");
        System.out.println("Question " + number + " of " + total);
        System.out.println(text);
        for (int i = 0; i < options.length; i++) {
            System.out.println((char) ('A' + i) + ". " + options[i]);
        }
    }
}
