public class UserBankAccount {

    private double balance;

    // Constructor
    public UserBankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Check account balance
    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println(
                    "Deposit successful. Amount deposited: ₹" + amount
            );
        } else {
            System.out.println(
                    "Invalid amount. Deposit amount must be greater than 0."
            );
        }
    }

    // Withdraw money
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println(
                    "Invalid amount. Withdrawal amount must be greater than 0."
            );
        } else if (amount > balance) {
            System.out.println(
                    "Insufficient balance. Withdrawal cannot be completed."
            );
        } else {
            balance -= amount;
            System.out.println(
                    "Withdrawal successful. Amount withdrawn: ₹" + amount
            );
        }
    }
}
