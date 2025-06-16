public class NumberCheck {
    public static void main(String[] args) {
        // Create Scanner object to read input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the scanner
        scanner.close();
    }
    
}
