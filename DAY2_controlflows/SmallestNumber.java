import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        // Check if first number is the smallest
        boolean isSmallest = (number1 <= number2) && (number1 <= number3);

        // Print the result
        System.out.printf("Is the first number the smallest? %b%n", isSmallest);

        // Close the scanner
        scanner.close();
    }
}