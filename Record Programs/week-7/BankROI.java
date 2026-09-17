package Excersice;
import java.util.Scanner;
// Customer class
class Customer {
    int customerId;
    String name;
    Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }
    void displayCustomer() {
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + name);
    }
}
// Account class
class Acc {
    int accountNumber;
    double balance;
    Acc(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited : " + amount);
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn : " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    void displayBalance() { 
    	System.out.println("Balance : " + balance);
    }
}
// RBI is the base class
class RBI {
    double getRateOfInterest() {
        return 4.0;
    }
    void displayBank() {
        System.out.println("RBI rate of interest is : "+ getRateOfInterest() + "%");
    }
}
// SBI derived class
class SBI extends RBI {
    @Override
    double getRateOfInterest() {
        return 7.0;
    }
}
// ICICI derived class
class ICICI extends RBI {
    @Override
    double getRateOfInterest() {
        return 6.5;
    }
}
// PNB derived class
class PNB extends RBI {
    @Override
    double getRateOfInterest() {
        return 6.0;
    }
}
// Main class
public class BankROI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter the Bank name to find the rate of Interest : ");
        String bankName = sc.nextLine();
        // RBI reference variable
        RBI rbi;
        if (bankName.equalsIgnoreCase("RBI")) {
            rbi = new RBI();
        }
        else if (bankName.equalsIgnoreCase("SBI")) {
            rbi = new SBI();
        }
        else if (bankName.equalsIgnoreCase("ICICI")) {
            rbi = new ICICI();
        }
        else if (bankName.equalsIgnoreCase("PNB")) {
            rbi = new PNB();
        }
        else {
            System.out.println("Invalid bank name");
            sc.close();
            return;
        }
        // Runtime polymorphism
        rbi.displayBank();
        sc.close();
    }
}
