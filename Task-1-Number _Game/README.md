# CODSOFT - Task 1

## Number Game

### Description

The Number Game is a simple Java console-based game in which the computer generates a random number between 1 and 100. The player has to guess the number within a limited number of attempts.

After each guess, the program provides feedback indicating whether the guessed number is too high or too low. The game continues until the player guesses the correct number or uses all available attempts.

The player can also play multiple rounds, and a score is maintained based on the number of attempts used.

## Features

* Generates a random number between 1 and 100.
* Allows the user to enter guesses.
* Provides feedback:

  * Too high
  * Too low
  * Correct guess
* Limits the player to 7 attempts per round.
* Allows multiple rounds.
* Maintains a running score.
* Validates invalid and out-of-range input.
* Displays the correct number when all attempts are used.

## Technologies Used

* Java
* Java `Scanner`
* Java `Random`
* Conditional statements
* Loops

## How to Run

### 1. Clone the repository

```bash
git clone <your-github-repository-url>
```

### 2. Open the project

Open the `Task-1-Number-Game` folder in a Java-supported IDE such as:

* IntelliJ IDEA
* Eclipse
* Visual Studio Code
* NetBeans

### 3. Compile the program

```bash
javac NumberGame.java
```

### 4. Run the program

```bash
java NumberGame
```

## How the Game Works

1. The computer generates a random number between 1 and 100.
2. The player is given 7 attempts.
3. The player enters a guess.
4. The program compares the guess with the generated number.
5. If the guess is:

   * Lower than the generated number → `Too low`
   * Higher than the generated number → `Too high`
   * Equal to the generated number → `Correct`
6. If the player guesses correctly, the round is won and the score is updated.
7. If all attempts are used, the correct number is displayed.
8. The player can choose to start another round.
9. The final score is displayed when the player exits the game.

## Sample Output

```text
=================================
       NUMBER GUESSING GAME
=================================

I have selected a number between 1 and 100.
You have 7 attempts to guess it.

Enter your guess: 50
Too high! Try a lower number.
Attempts remaining: 6

Enter your guess: 25
Too low! Try a higher number.
Attempts remaining: 5

Enter your guess: 37
Congratulations! You guessed the number correctly.
Number of attempts: 3

Current score: 5

Do you want to play another round? (yes/no): no

=================================
          GAME OVER
=================================
Final Score: 5
Thank you for playing!
```

## Learning Outcomes

Through this project, I practiced:

* Java programming fundamentals
* Random number generation
* User input handling
* Conditional statements
* Loops
* Input validation
* Score calculation
* Basic game development logic

## Author

**[Your Name]**

Java Developer Intern
CODSOFT Internship
