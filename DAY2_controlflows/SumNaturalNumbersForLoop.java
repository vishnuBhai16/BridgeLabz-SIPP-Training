public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        int n = 10; // Change this value to sum natural numbers up to n
        int sum = 0;

        // Loop through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i; // Add the current number to the sum
        }

        // Print the result
        System.out.println("The sum of natural numbers up to " + n + " is: " + sum);
    }
    
}
