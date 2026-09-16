package task;
//Bank Account System using OOP concepts
//Base class: common details and operations of every account
class Account {
    int accountNumber;
    String accountHolderName;
    double balance;
    String accountType;
    // Constructor
    Account(int accountNumber, String accountHolderName,double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }
    // Deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    // Withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    // Transfer money
    void transfer(Account receiver, double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;
            System.out.println("Transferred: " + amount);
        } else {
            System.out.println("Transfer failed");
        }
    }
    // Display account details
    void displayAccountDetails() {
        System.out.println("Account Number  : " + accountNumber);
        System.out.println("Account Holder  : " + accountHolderName);
        System.out.println("Account Type    : " + accountType);
        System.out.println("Balance         : " + balance);
    }
}
// SavingsAccount inherits Account
class SavingsAccount extends Account {
    double interestRate;
    // Constructor
    SavingsAccount(int accountNumber, String accountHolderName,double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance, "Savings");
        this.interestRate = interestRate;
    }
    // Calculate interest
    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance = balance + interest;
        System.out.println("Interest Added: " + interest);
    }
}
// CurrentAccount inherits Account
class CurrentAccount extends Account {
    double overdraftLimit;
    // Constructor
    CurrentAccount(int accountNumber, String accountHolderName,double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }
    // Method overriding
    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit");
        }
    }
}
//Main class: creates objects and performs transactions
public class BankSystem {
	public static void main(String[] args) {
        // Creating SavingsAccount object
        SavingsAccount savings =
            new SavingsAccount(101, "Raki", 10000, 5);
        // Creating CurrentAccount object
        CurrentAccount current =
            new CurrentAccount(102, "Priya", 5000, 3000);
        System.out.println("===== INITIAL ACCOUNT DETAILS =====");
        System.out.println("\nSavings Account");
        savings.displayAccountDetails();
        System.out.println("\nCurrent Account");
        current.displayAccountDetails();
        // Savings account operations
        System.out.println("\n===== SAVINGS ACCOUNT OPERATIONS =====");
        savings.deposit(2000);
        savings.withdraw(1000);
        savings.calculateInterest();
        // Current account operations
        System.out.println("\n===== CURRENT ACCOUNT OPERATIONS =====");
        current.deposit(3000);
        current.withdraw(9000);
        // Transfer money from savings to current
        System.out.println("\n===== FUND TRANSFER =====");
        savings.transfer(current, 2000);
        // Final details
        System.out.println("\n===== FINAL ACCOUNT DETAILS =====");
        System.out.println("\nSavings Account");
        savings.displayAccountDetails();
        System.out.println("\nCurrent Account");
        current.displayAccountDetails();
    }
}