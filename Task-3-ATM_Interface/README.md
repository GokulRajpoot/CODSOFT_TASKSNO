# CODSOFT - Task 3

## ATM Interface

### Description

The ATM Interface is a Java console-based application that simulates basic ATM operations.

The application allows the user to check their account balance, deposit money, withdraw money, and exit the ATM. The project uses two classes: `ATM` for the user interface and `BankAccount` for storing and managing the account balance.

## Features

- Displays an ATM menu.
- Checks the current account balance.
- Allows the user to deposit money.
- Allows the user to withdraw money.
- Validates deposit and withdrawal amounts.
- Prevents withdrawals when the account has insufficient balance.
- Handles invalid menu input.
- Uses separate classes for the ATM and bank account.
- Allows multiple transactions during one session.

## Technologies Used

- Java
- Java `Scanner`
- Classes and objects
- Methods
- Conditional statements
- Loops
- Switch statements
- Input validation

## Project Structure

``text
Task-3-ATM-Interface
├── ATM.java
├── BankAccount.java
└── README.md

## How to Run

1. Open the Project

Open the `Task-3-ATM-Interface` folder in a Java-supported IDE such as:

- IntelliJ IDEA
- Eclipse
- Visual Studio Code
- NetBeans
- 
2. Compile the Program
`javac BankAccount.java ATM.java`

3. Run the Program
`java ATM`

## How the Program Works
1. The program creates a bank account with an initial balance of ₹10,000.
2. The ATM menu is displayed.
3. The user can select one of the following options:
- Check Balance
- Deposit Money
- Withdraw Money
- Exit
4. When money is deposited, the account balance is increased.
5. When money is withdrawn, the program checks whether sufficient balance is available.
6. If the withdrawal amount is greater than the available balance, the transaction is rejected.
7. The updated balance can be checked at any time.
8. The user can continue performing transactions until selecting the Exit option.
  
## Sample Output
=================================
          ATM INTERFACE
=================================

----------- ATM MENU -----------
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
--------------------------------

Enter your choice: 1

Current Balance: ₹10000.0

----------- ATM MENU -----------
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
--------------------------------

Enter your choice: 2

Enter amount to deposit: ₹40000

Deposit successful. Amount deposited: ₹40000.0

----------- ATM MENU -----------
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
--------------------------------

Enter your choice: 1

Current Balance: ₹50000.0

----------- ATM MENU -----------
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
--------------------------------

Enter your choice: 3

Enter amount to withdraw: ₹20000

Withdrawal successful. Amount withdrawn: ₹20000.0

----------- ATM MENU -----------
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
--------------------------------

Enter your choice: 1

Current Balance: ₹30000.0

----------- ATM MENU -----------
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
--------------------------------

Enter your choice: 4

Thank you for using the ATM.

Please collect your card.


## Learning Outcomes

Through this project, I practiced:

- Java programming fundamentals
- Classes and objects
- Creating and using methods
- Encapsulation
- User input handling
- Conditional statements
- Loops
- Switch statements
- Input validation
- Basic banking transaction logic
- Interaction between multiple Java classes

## Author

Gokul Rajpoot

Java Developer Intern
CODSOFT Internship
