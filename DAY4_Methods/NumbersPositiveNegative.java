package Day_4_Methods;

import java.util.Scanner;

public class NumbersPositiveNegative {
    static boolean isPositive(int num) {
        return num > 0;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }
    static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        if (n1 == n2) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int n : nums) {
            if (isPositive(n)) {
                System.out.print(n + " is positive and ");
                System.out.println(isEven(n) ? "even" : "odd");
            } else if (n < 0) {
                System.out.println(n + " is negative");
            } else {                         // n == 0
                System.out.println("0 is neither positive nor negative");
            }
        }

        int res = compare(nums[0], nums[nums.length - 1]);
        switch (res) {
            case 1  -> System.out.println("First element is greater than the last element.");
            case 0  -> System.out.println("First and last elements are equal.");
            case -1 -> System.out.println("First element is less than the last element.");
        }
    }
}
