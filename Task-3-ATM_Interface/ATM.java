import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Create a bank account with an initial balance
        UserBankAccount account = new UserBankAccount(10000);

        boolean running = true;

        System.out.println("=================================");
        System.out.println("          ATM INTERFACE");
        System.out.println("=================================");

        while (running) {

            System.out.println("\n----------- ATM MENU -----------");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("--------------------------------");

            System.out.print("Enter your choice: ");

            if (!scan.hasNextInt()) {
                System.out.println(
                        "Invalid input! Please enter a number between 1 and 4."
                );
                scan.next();
                continue;
            }

            int choice = scan.nextInt();

            switch (choice) {

                case 1:
                    // Check balance
                    System.out.println(
                            "Current Balance: ₹" + account.getBalance()
                    );
                    break;

                case 2:
                    // Deposit money
                    System.out.print("Enter amount to deposit: ₹");

                    if (!scan.hasNextDouble()) {
                        System.out.println(
                                "Invalid amount! Please enter a valid number."
                        );
                        scan.next();
                        break;
                    }

                    double depositAmount = scan.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    // Withdraw money
                    System.out.print("Enter amount to withdraw: ₹");

                    if (!scan.hasNextDouble()) {
                        System.out.println(
                                "Invalid amount! Please enter a valid number."
                        );
                        scan.next();
                        break;
                    }

                    double withdrawAmount = scan.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    // Exit ATM
                    System.out.println(
                            "\nThank you for using the ATM."
                    );
                    System.out.println("Please collect your card.");
                    running = false;
                    break;

                default:
                    System.out.println(
                            "Invalid choice! Please select an option from 1 to 4."
                    );
            }
        }

        scan.close();
    }
}
