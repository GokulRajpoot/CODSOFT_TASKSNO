# CODSOFT - Task 5

## Student Course Registration System

### Description

The Student Course Registration System is a console-based Java application that allows students to browse courses, register for courses, view their registered courses, and drop courses when needed.

The application manages course and student records using separate classes. It validates registrations to prevent duplicate enrollments, registrations for full courses, schedule clashes, and invalid course or student details.

## Features

- Displays all available courses and their details.
- Shows course capacity and available slots.
- Allows new students to be added.
- Enables students to register for courses.
- Allows students to drop registered courses.
- Displays student details and registered courses.
- Prevents duplicate course registrations.
- Checks course capacity before registration.
- Prevents schedule clashes.
- Validates student IDs and course codes.
- Uses separate classes to organize the application logic.

## Validation Rules

The application checks the following conditions before processing a registration or course removal:

- The student ID must exist.
- The course code must exist.
- A student cannot register for the same course twice.
- A full course cannot accept additional registrations.
- A student cannot register for two courses with the same schedule.
- A student cannot drop a course they are not registered for.

Course codes and student IDs are case-insensitive.

## Technologies Used

- Java
- Java Collections Framework
- `HashMap` for storing student and course records
- Object-oriented programming
- Classes and objects
- Methods
- Conditional statements
- Loops
- Input validation

## Project Structure

```text
Task-5-Student-Course-Registration-System
└── com
     └── codsoft
            ├── Main.java
            ├── Course.java
            ├── Student.java
            ├── CourseDatabase.java
            ├── StudentDatabase.java
            └── RegistrationService.java
```

## How to Run

### 1. Requirements

Install Java JDK 8 or higher.

### 2. Open the Project

Open the project folder in a Java-supported IDE such as:

- IntelliJ IDEA
- Eclipse
- Visual Studio Code

### 3. Compile the Program

Open the terminal in the project root folder and run:

```bash
javac -d out com/codsoft/*.java
```

### 4. Run the Program

```bash
java -cp out com.codsoft.Main
```

## Menu Options

The application provides the following menu:

```text
===== Student Course Registration System =====
1. View all courses
2. View available courses (with free slots)
3. Add new student
4. Register for a course
5. Drop a course
6. View student details
0. Exit
```

## Sample Data

The application starts with sample course and student records.

### Courses

| Course Code | Course Title | Schedule | Capacity |
|-------------|--------------|----------|----------|
| CS101 | Intro to Programming | Mon 9-11 | 3 |
| CS201 | Data Structures | Tue 10-12 | 2 |
| CS301 | Database Systems | Wed 11-1 | 30 |
| MA101 | Discrete Mathematics | Mon 9-11 | 25 |

### Students

- `S001` — Gokul
- `S002` — Aman

## How the Program Works

1. The program loads the initial course and student records.
2. The user selects an option from the menu.
3. The user can view all courses or only courses with available slots.
4. New students can be added with a student ID and name.
5. Students can register for courses by providing their student ID and course code.
6. The registration service checks course availability, duplicate registrations, and schedule clashes.
7. Students can drop courses they have already registered for.
8. The program updates enrollment counts when registrations or removals succeed.
9. The user can view student details and their registered courses.
10. The program continues until the user chooses Exit.

## Sample Output

```text
===== Student Course Registration System =====
1. View all courses
2. View available courses (with free slots)
3. Add new student
4. Register for a course
5. Drop a course
6. View student details
0. Exit

Choose an option: 1

CS101    Intro to Programming         Mon 9-11           Slots: 3/3
         Java basics, OOP fundamentals
CS201    Data Structures              Tue 10-12          Slots: 2/2
         Lists, trees, graphs, hashing
CS301    Database Systems             Wed 11-1           Slots: 30/30
         SQL, normalization, transactions
MA101    Discrete Mathematics         Mon 9-11           Slots: 25/25
         Logic, sets, combinatorics

Choose an option: 4
Student ID: S001
Course code: CS101
Success: Gokul registered for CS101 - Intro to Programming.

Choose an option: 2

CS101    Intro to Programming         Mon 9-11           Slots: 2/3
         Java basics, OOP fundamentals

Choose an option: 0
Goodbye!
```

## Possible Improvements

- Save student and course records to a file or MySQL database.
- Add a menu option to create new courses.
- Implement a credit limit for each student.
- Add custom exceptions for registration errors.
- Create unit tests for the registration service.

## Learning Outcomes

Through this project, I practiced:

- Java programming fundamentals
- Object-oriented programming
- Classes and objects
- Encapsulation
- Java collections and maps
- Separating application responsibilities
- Implementing business rules
- Input validation
- Course capacity management
- Duplicate registration prevention
- Schedule conflict detection
- Console-based application development

## Author

**Gokul Rajpoot**

B.Tech Computer Science  
Sagar Institute of Research and Technology - Excellence

Java Developer Intern  
CODSOFT Internship
