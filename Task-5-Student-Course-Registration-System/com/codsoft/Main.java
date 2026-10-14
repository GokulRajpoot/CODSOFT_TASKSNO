package com.codsoft;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final CourseDatabase courseDb = new CourseDatabase();
    private static final StudentDatabase studentDb = new StudentDatabase();
    private static final RegistrationService service = new RegistrationService(courseDb, studentDb);
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        seedData();
        while (true) {
            printMenu();
            String choice = in.nextLine().trim();
            switch (choice) {
                case "1": listCourses(false); break;
                case "2": listCourses(true); break;
                case "3": addStudent(); break;
                case "4": register(); break;
                case "5": drop(); break;
                case "6": viewStudent(); break;
                case "0":
                    System.out.println("Goodbye!");
                    return;
                default: System.out.println("Invalid choice, try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n===== Student Course Registration System =====");
        System.out.println("1. View all courses");
        System.out.println("2. View available courses (with free slots)");
        System.out.println("3. Add new student");
        System.out.println("4. Register for a course");
        System.out.println("5. Drop a course");
        System.out.println("6. View student details");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    private static void listCourses(boolean onlyAvailable) {
        List<Course> list = onlyAvailable ? courseDb.getAvailableCourses() : courseDb.getAllCourses();
        if (list.isEmpty()) {
            System.out.println("No courses to show.");
            return;
        }
        System.out.println();
        for (Course c : list) System.out.println(c);
    }

    private static void addStudent() {
        System.out.print("Student ID: ");
        String id = in.nextLine().trim();
        System.out.print("Name: ");
        String name = in.nextLine().trim();
        if (id.isEmpty() || name.isEmpty()) {
            System.out.println("Error: ID and name cannot be empty.");
            return;
        }
        System.out.println(studentDb.addStudent(new Student(id, name))
                ? "Student added." : "Error: student ID already exists.");
    }

    private static void register() {
        System.out.print("Student ID: ");
        String id = in.nextLine().trim();
        System.out.print("Course code: ");
        String code = in.nextLine().trim();
        System.out.println(service.register(id, code));
    }

    private static void drop() {
        System.out.print("Student ID: ");
        String id = in.nextLine().trim();
        System.out.print("Course code to drop: ");
        String code = in.nextLine().trim();
        System.out.println(service.drop(id, code));
    }

    private static void viewStudent() {
        System.out.print("Student ID: ");
        Student s = studentDb.getStudent(in.nextLine().trim());
        System.out.println(s == null ? "Error: student not found." : s);
    }

    private static void seedData() {
        courseDb.addCourse(new Course("CS101", "Intro to Programming", "Java basics, OOP fundamentals", 3, "Mon 9-11"));
        courseDb.addCourse(new Course("CS201", "Data Structures", "Lists, trees, graphs, hashing", 2, "Tue 10-12"));
        courseDb.addCourse(new Course("CS301", "Database Systems", "SQL, normalization, transactions", 30, "Wed 11-1"));
        courseDb.addCourse(new Course("MA101", "Discrete Mathematics", "Logic, sets, combinatorics", 25, "Mon 9-11"));
        studentDb.addStudent(new Student("S001", "Gokul"));
        studentDb.addStudent(new Student("S002", "Aman"));
    }
}
