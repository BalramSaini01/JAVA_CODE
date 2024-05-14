import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 10 integers
        int[] originalArray = new int[10];

        // Input integers from the user and store them in the original array
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            originalArray[i] = scanner.nextInt();
        }

        // Create a new array to store elements in reverse order
        int[] reversedArray = new int[10];

        // Copy elements from the original array to the reversed array in reverse order
        for (int i = 0; i < 10; i++) {
            reversedArray[i] = originalArray[9 - i];
        }

        // Print the original array
        System.out.println("Original array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println(); // Print a newline for clarity

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
        System.out.println(); // Print a newline for clarity

        scanner.close();
    }
}
