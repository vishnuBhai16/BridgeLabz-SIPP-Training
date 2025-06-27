public class GreatestFactor {
    public static void main(String[] args) {
        int number = 100; // Example number
        int greatestFactor = 1; // Initialize the greatest factor

        // Loop to find the greatest factor
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                greatestFactor = i; // Update the greatest factor
            }
        }

        // Print the greatest factor
        System.out.println("The greatest factor of " + number + " is: " + greatestFactor);
    }
    
}
