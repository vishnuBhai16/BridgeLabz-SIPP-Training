public class FactorsOfNumber {
    public static void main(String[] args) {
        int number = 28; // Example number to find factors of
        System.out.println("Factors of " + number + " are:");

        // Loop through numbers from 1 to the given number
        for (int i = 1; i <= number; i++) {
            // Check if i is a factor of the number
            if (number % i == 0) {
                System.out.println(i); // Print the factor
            }
        }
    }
    
}
