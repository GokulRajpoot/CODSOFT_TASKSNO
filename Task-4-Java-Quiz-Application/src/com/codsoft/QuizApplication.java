package com.codsoft;

public class QuizApplication {
    public static void main(String[] args) {
        new QuizManager(QuestionBank.getQuestions(5)).start();
    }
}
