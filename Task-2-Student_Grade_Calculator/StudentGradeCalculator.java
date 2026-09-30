import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      STUDENT GRADE CALCULATOR");
        System.out.println("=================================");

        System.out.print("\nEnter the number of subjects: ");

        while (!scan.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number.");
            scan.next();
            System.out.print("Enter the number of subjects: ");
        }

        int numberOfSubjects = scan.nextInt();

        // Validate number of subjects
        while (numberOfSubjects <= 0) {
            System.out.println("Number of subjects must be greater than 0.");
            System.out.print("Enter the number of subjects: ");

            while (!scan.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scan.next();
                System.out.print("Enter the number of subjects: ");
            }

            numberOfSubjects = scan.nextInt();
        }

        int totalMarks = 0;

        // Take marks for each subject
        for (int i = 1; i <= numberOfSubjects; i++) {

            System.out.print("Enter marks for Subject " + i + " (out of 100): ");

            while (!scan.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scan.next();
                System.out.print(
                        "Enter marks for Subject " + i + " (out of 100): "
                );
            }

            int marks = scan.nextInt();

            // Validate marks
            while (marks < 0 || marks > 100) {
                System.out.println(
                        "Invalid marks! Please enter marks between 0 and 100."
                );

                System.out.print(
                        "Enter marks for Subject " + i + " (out of 100): "
                );

                while (!scan.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a number.");
                    scan.next();
                    System.out.print(
                            "Enter marks for Subject " + i + " (out of 100): "
                    );
                }

                marks = scan.nextInt();
            }

            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage =
                (double) totalMarks / numberOfSubjects;

        // Calculate grade
        String grade;

        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("\n=================================");
        System.out.println("           RESULT");
        System.out.println("=================================");

        System.out.println("Total Marks       : " + totalMarks
                + " / " + (numberOfSubjects * 100));

        System.out.printf("Average Percentage: %.2f%%%n", averagePercentage);

        System.out.println("Grade             : " + grade);

        System.out.println("=================================");

        scan.close();
    }
}
