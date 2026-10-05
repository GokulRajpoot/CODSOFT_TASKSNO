# 🎯 Java Quiz Application

A **console-based quiz application built with Java** that presents users with randomly selected multiple-choice questions. Each question has a **15-second time limit**, and the application provides a detailed score summary at the end.

---

## ✨ Features

* 🎲 **Random Questions** — Selects 5 random questions from a bank of 20 on every run.
* 🔀 **Shuffled Options** — Answer options are shuffled for every question.
* ⏱️ **Timed Questions** — Each question has a 15-second time limit.
* ❌ **Input Validation** — Handles invalid answers gracefully.
* ⌛ **Timeout Handling** — Automatically marks unanswered questions when the time expires.
* 📊 **Detailed Results** — Displays:

  * Total questions
  * Correct answers
  * Incorrect answers
  * Unanswered questions
  * Final score
  * Answer summary

---

## 🛠️ Technologies & Concepts

* **Java**
* Object-Oriented Programming (OOP)
* Encapsulation
* Single Responsibility Principle
* Java Collections
* `ExecutorService`
* `Future`
* Exception Handling
* Try-with-resources
* Multithreading and timed input

---

## 📁 Project Structure

| Class              | Responsibility                                         |
| ------------------ | ------------------------------------------------------ |
| `Question`         | Stores a question, its options, and the correct answer |
| `QuestionBank`     | Holds all questions and returns a random set           |
| `TimedInputReader` | Reads console input with a time limit                  |
| `QuizResult`       | Tracks the score and prints the result summary         |
| `QuizManager`      | Runs the quiz flow                                     |
| `QuizApplication`  | Entry point containing the `main()` method             |

### Project Layout

```text
Java-Quiz-Application/
│
├── src/
│   └── com/
│       └── codsoft/
│           ├── Question.java
│           ├── QuestionBank.java
│           ├── TimedInputReader.java
│           ├── QuizResult.java
│           ├── QuizManager.java
│           └── QuizApplication.java
│
└── README.md
```

---

## 🚀 How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/GokulRajpoot/Java-Quiz-Application.git
```

### 2. Navigate to the Project

```bash
cd Java-Quiz-Application
```

### 3. Compile the Source Files

From the `src` directory:

```bash
cd src
javac com/codsoft/*.java
```

### 4. Run the Application

```bash
java com.codsoft.QuizApplication
```

---

## 🎮 How It Works

The application follows this flow:

```text
                    ┌──────────────────┐
                    │ Start Application│
                    └────────┬─────────┘
                             │
                             ▼
                  ┌─────────────────────┐
                  │ Select 5 Random     │
                  │ Questions from 20   │
                  └─────────┬───────────┘
                            │
                            ▼
                  ┌─────────────────────┐
                  │ Shuffle Answer      │
                  │ Options              │
                  └─────────┬───────────┘
                            │
                            ▼
                  ┌─────────────────────┐
                  │ Ask Question        │
                  │ (15 Seconds)        │
                  └─────────┬───────────┘
                            │
                     ┌──────┴──────┐
                     │             │
                  Answer         Timeout
                     │             │
                     └──────┬──────┘
                            │
                            ▼
                  ┌─────────────────────┐
                  │ Record Result       │
                  └─────────┬───────────┘
                            │
                            ▼
                  ┌─────────────────────┐
                  │ More Questions?     │
                  └─────────┬───────────┘
                            │
                            ▼
                  ┌─────────────────────┐
                  │ Display Final       │
                  │ Score Summary       │
                  └─────────────────────┘
```

---

## 🖥️ Example Output

```text
=================================
       JAVA QUIZ APPLICATION
=================================

Each question has 15 seconds.
Enter A, B, C, or D to answer.

---------------------------------
Question 1 of 5
Which operator is used to compare two values for equality?
A. :=
B. =
C. ==
D. !=
Time limit: 15 seconds
Your answer: c
Correct answer!

---------------------------------
Question 2 of 5
Which access modifier restricts a member to its own class only?
A. public
B. protected
C. default
D. private
Time limit: 15 seconds
Your answer: d
Correct answer!

---------------------------------
Question 3 of 5
Using the same method name with different parameters is called?
A. Encapsulation
B. Overloading
C. Abstraction
D. Overriding
Time limit: 15 seconds
Your answer: b
Correct answer!

---------------------------------
Question 4 of 5
Which package contains the Scanner class?
A. java.io
B. java.lang
C. java.util
D. java.net
Time limit: 15 seconds
Your answer: c
Correct answer!

---------------------------------
Question 5 of 5
Which keyword is used to create an object in Java?
A. create
B. make
C. new
D. object
Time limit: 15 seconds
Your answer: c
Correct answer!

=================================
           QUIZ RESULT
=================================
Total Questions : 5
Correct Answers : 5
Incorrect       : 0
Unanswered      : 0
Final Score     : 5 / 5

Answer Summary:

Question 1: Which operator is used to compare two values for equality?
Your answer: C
Correct answer: C

Question 2: Which access modifier restricts a member to its own class only?
Your answer: D
Correct answer: D

Question 3: Using the same method name with different parameters is called?
Your answer: B
Correct answer: B

Question 4: Which package contains the Scanner class?
Your answer: C
Correct answer: C

Question 5: Which keyword is used to create an object in Java?
Your answer: C
Correct answer: C

Thank you for taking the quiz!
```

---

## 🧠 Key Java Concepts Demonstrated

### Object-Oriented Programming

The application is divided into multiple classes, with each class having a specific responsibility.

### Collections

Java Collections are used to manage questions, answer options, and quiz results.

### ExecutorService & Future

`ExecutorService` and `Future` are used to implement the **15-second input timeout**.

### Exception Handling

The application handles invalid user input and other runtime situations without abruptly terminating.

### Try-with-Resources

Resources are managed safely using Java's try-with-resources mechanism.

---

## 🔮 Possible Future Improvements

* Add different difficulty levels
* Add more question categories
* Store questions in a database
* Add a graphical user interface (GUI)
* Add a leaderboard
* Save quiz history
* Add configurable time limits
* Add multiplayer support

---

## 👨‍💻 Author

**Gokul Rajpoot**
