import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    // Method to set dimensions of the rectangle
    public void setDim(double len, double brd) {
        length = len;
        breadth = brd;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        return length * breadth;
    }
}

public class garea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of the 'Area' class
        Area rectangle = new Area();

        // Input length and breadth of the rectangle from the user
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Set dimensions of the rectangle
        rectangle.setDim(length, breadth);

        // Calculate and print the area of the rectangle
        System.out.println("Area of the rectangle: " + rectangle.getArea());

        scanner.close();
    }
}
