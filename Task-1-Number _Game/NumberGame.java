package com.codesoft;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        boolean playAgain = true;

        System.out.println("=================================");
        System.out.println("       NUMBER GUESSING GAME");
        System.out.println("=================================");

        while (playAgain) {

            // Generate random number between 1 and 1000
            int numberToGuess = random.nextInt(1000) + 1;

            int maxAttempts = 5;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nI have selected a number between 1 and 1000.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts) {

                System.out.print("\nEnter your guess: ");

                // Validate that the user enters an integer
                if (!scan.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a number.");
                    scan.next();
                    continue;
                }

                int guess = scan.nextInt();

                // Validate range
                if (guess < 1 || guess > 1000) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }

                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    System.out.println("Number of attempts: " + attempts);

                    // Higher score for fewer attempts
                    score += maxAttempts - attempts + 1;
                    guessedCorrectly = true;

                    break;
                } 
                else if (guess < numberToGuess) {
                    System.out.println("Too low! Try a higher number.");
                } 
                else {
                    System.out.println("Too high! Try a lower number.");
                }

                System.out.println("Attempts remaining: " + (maxAttempts - attempts));
            }

            // If the user couldn't guess the number
            if (!guessedCorrectly) {
                System.out.println("\nYou have used all your attempts.");
                System.out.println("The correct number was: " + numberToGuess);
            }

            System.out.println("\nCurrent score: " + score);

            // Ask whether the user wants another round
            System.out.print("\nDo you want to play another round? (yes/no): ");
            String response = scan.next();

            if (!response.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\n=================================");
        System.out.println("          GAME OVER                ");
        System.out.println("===================================");
        System.out.println("Final Score: " + score);
        System.out.println("Thank you for playing!");

        scan.close();
    }
}
