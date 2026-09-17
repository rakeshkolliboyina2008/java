package Excersice;
import java.util.Scanner;

class Employee {
    String employeeId;

    Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    void salaryDetails() {
        System.out.println("Salary details not available");
    }
}

class RegularEmployee extends Employee {

    RegularEmployee(String employeeId) {
        super(employeeId);
    }

    @Override
    void salaryDetails() {
        int basicPay = 25000;
        int hra = 15000;
        int ta = 5000;
        int total = basicPay + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay+ " HRA: " + hra+ " T.A: " + ta + " Total Amount: " + total);
    }
}

class ContractEmployee extends Employee {

    ContractEmployee(String employeeId) {
        super(employeeId);
    }

    @Override
    void salaryDetails() {
        int basicPay = 12000;
        int ta = 3000;
        int total = basicPay + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay+ " T.A: " + ta + " Total Amount: " + total);
    }
}

public class EmployeDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String id = sc.nextLine();

        Employee emp;

        // R = Regular Employee
        // C = Contract Employee
        if (id.charAt(0) == 'R' || id.charAt(0) == 'r') {
            emp = new RegularEmployee(id);
        }
        else if (id.charAt(0) == 'C' || id.charAt(0) == 'c') {
            emp = new ContractEmployee(id);
        }
        else {
            System.out.println("Invalid Employee Id");
            sc.close();
            return;
        }

        // Runtime polymorphism
        emp.salaryDetails();

        sc.close();
    }
}