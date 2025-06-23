package Day_4_Methods;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static long recursiveSum(long n) {
        if (n == 0)
            return 0; // base case
        return n + recursiveSum(n - 1); // recursive step
    }

    /** Formula n(n + 1)/2. */
    public static long formulaSum(long n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (n > 0): ");
        long n = scanner.nextLong();
        scanner.close();

        if (n <= 0) {
            System.out.println("Input must be a positive natural number.");
            return;
        }

        long sumRecursive = recursiveSum(n);
        long sumFormula = formulaSum(n);

        System.out.println("\nResults");
        System.out.println("-------");
        System.out.printf("Recursive method : %d%n", sumRecursive);
        System.out.printf("Formula n(n+1)/2 : %d%n", sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("✅  Both methods give the same result.");
        } else {
            System.out.println("❌  The results do not match (something is wrong).");
        }
    }
}