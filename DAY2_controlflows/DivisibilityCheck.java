import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if number is divisible by 5
        boolean isDivisible = (number % 5 == 0);

        // Print the result in the required format
        System.out.printf("Is the number %d divisible by 5? %b%n",
                number, isDivisible);

        // Close the scanner
        scanner.close();
    }
}