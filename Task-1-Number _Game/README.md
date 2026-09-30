CODSOFT - Task 1

Number Game

Description

The Number Game is a simple Java console-based game in which the computer generates a random number between 1 and 100. The player has to guess the number within a limited number of attempts.

After each guess, the program provides feedback indicating whether the guess is too high or too low. The game continues until the player guesses the correct number or uses all available attempts.

The player can also play multiple rounds, and a score is maintained based on the number of attempts used.

Features

💠Generates a random number between 1 and 100.

💠Allows the user to enter guesses.

💠Provides feedback: Too high, Too low, Correct guess.

💠Limits the player to 5 attempts per round.

💠Allows multiple rounds.

💠Maintains a running score.

💠Validates invalid and out-of-range input.

💠Displays the correct number when all attempts are used.

Technologies Used

💠Java

💠Java Scanner

💠Java Random

💠Conditional statements

💠Loops

How to Run

1. Clone the Repository

git clone <your-github-repository-url>

2. Open the Project

Open the Task-1-Number_Game folder in a Java-supported IDE such as IntelliJ IDEA, Eclipse, Visual Studio Code, or NetBeans.

3. Compile the Program

javac NumberGame.java

4. Run the Program

java NumberGame

How the Game Works

1. The computer generates a random number between 1 and 100.

2. The player is given 5 attempts.

3. The player enters a guess.

4. The program compares the guess with the generated number.

5. If the guess is lower than the generated number, the program displays “Too low”. If higher, it displays “Too high”. If equal, the guess is correct.

6. If the player guesses correctly, the round is won and the score is updated.

7. If all attempts are used, the correct number is displayed.

8. The player can choose to start another round.

9. The final score is displayed when the player exits the game.

Scoring

The score is based on the number of attempts used to guess the correct number.

1 attempt → 5 points

2 attempts → 4 points

3 attempts → 3 points

4 attempts → 2 points

5 attempts → 1 point

No correct guess → 0 points

The score continues to accumulate across multiple rounds.

Sample Output

=================================

       NUMBER GUESSING GAME

=================================


I have selected a number between 1 and 100.

You have 5 attempts to guess it.


Enter your guess: 50

Too high! Try a lower number.

Attempts remaining: 4


Enter your guess: 25

Too low! Try a higher number.

Attempts remaining: 3


Enter your guess: 35

Too low! Try a higher number.

Attempts remaining: 2


Enter your guess: 42

Congratulations! You guessed the number correctly.

Number of attempts: 4


Current score: 2


Do you want to play another round? (yes/no): no


=================================

           GAME OVER

=================================

Final Score: 2

Thank you for playing!

Learning Outcomes

Java programming fundamentals

💠Random number generation

💠User input handling

💠Conditional statements

💠Loops

💠Input validation

💠Score calculation

💠Basic game development logic

Author

Gokul Rajpoot

Java Developer Intern

CODSOFT Internship
