public class SumNaturalNumbersComparison {
    public static void main(String[] args) {
        // Create Scanner object to read input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Check if the number is a natural number
        if (n >= 1) {
            // Calculate the sum of natural numbers up to n
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        // Close the scanner
        scanner.close();
    }
    
}
