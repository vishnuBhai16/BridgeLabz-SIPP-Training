package DAY4_Methods;

import java.math.BigInteger;
import java.util.*;

public class Factors {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += (i == n / i) ? 1 : 2; // perfect‑square check
            }
        }

        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factors[idx++] = i;
                if (i != n / i)
                    factors[idx++] = n / i;
            }
        }
        return factors;
    }

    public static long sum(int[] arr) {
        long s = 0;
        for (int x : arr)
            s += x;
        return s;
    }

    public static BigInteger product(int[] arr) {
        BigInteger p = BigInteger.ONE;
        for (int x : arr)
            p = p.multiply(BigInteger.valueOf(x));
        return p;
    }

    public static long sumOfSquares(int[] arr) {
        long ss = 0;
        for (int x : arr)
            ss += (long) x * x;
        return ss;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 0) {
            System.out.println("Number must be positive.");
            return;
        }

        int[] factors = findFactors(n);

        System.out.print("Factors of " + n + ": ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + (i == factors.length - 1 ? "" : ", "));
        }
        System.out.println();

        long sum = sum(factors);
        BigInteger prod = product(factors);
        long sumSq = sumOfSquares(factors);

        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + prod);
        System.out.println("Sum of squares of factors: " + sumSq);
    }
}