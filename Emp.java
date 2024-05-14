package employee;

public class Emp {
    // Declare variables
    String name;
    int empid;
    String category;
    double bpay;
    double hra;
    double da;
    double npay;
    double pf;
    double grosspay;
    double incometax;
    double allowance;

    // Method to calculate net pay
    public void calculateNetPay() {
        grosspay = bpay + hra + da;
        pf = 0.12 * bpay;
        npay = grosspay - pf;
        incometax = 0.10 * npay;
        allowance = 0.05 * npay;
    }

    // Method to print details
    public void printDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Category: " + category);
        System.out.println("Basic Pay: " + bpay);
        System.out.println("Net Pay: " + npay);
        System.out.println("Gross Pay: " + grosspay);
        System.out.println("Income Tax: " + incometax);
        System.out.println("Allowance: " + allowance);
    }
}
