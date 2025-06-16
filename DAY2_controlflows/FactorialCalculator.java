public class FactorialCalculator {
    public static void main(String[] args) {
        // Create Scanner object to read input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Check if the number is a natural number
        if (n >= 0) {
            // Calculate factorial
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + n + " is " + factorial);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        // Close the scanner
        scanner.close();
    }
    
}
