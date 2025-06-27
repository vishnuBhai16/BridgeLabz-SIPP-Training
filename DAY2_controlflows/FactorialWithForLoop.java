public class FactorialWithForLoop {
    public static void main(String[] args) {
        int number = 5; // Number to calculate factorial for
        int factorial = 1; // Variable to store the factorial result

        // Loop to calculate factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply current value of factorial by i
        }

        // Print the result
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    
}
