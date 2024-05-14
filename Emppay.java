import employee.Emp;

public class Emppay {
    public static void main(String[] args) {
        // Create an object of Emp class
        Emp e = new Emp();

        // Set employee details
        e.name = "John";
        e.empid = 1001;
        e.category = "Regular";
        e.bpay = 50000;
        e.hra = 0.2 * e.bpay;
        e.da = 0.1 * e.bpay;

        // Calculate net pay
        e.calculateNetPay();

        // Print employee details
        System.out.println("Employee Payroll Details:");
        e.printDetails();
    }
}
