public class VotingEligibility {
    public static void main(String[] args) {
        // Create Scanner object to read input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt user to enter age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the user is eligible to vote
        boolean isEligible = (age >= 18);

        // Print the result
        System.out.printf("Are you eligible to vote? %b%n", isEligible);

        // Close the scanner
        scanner.close();
    }
    
}
