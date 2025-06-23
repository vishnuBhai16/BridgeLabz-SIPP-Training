import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Input must be a positive integer.");
            return;
        }
        String[] results = new String[n + 1];
        for (int i = 0; i <= n; i++) {
            boolean mult3 = (i % 3 == 0);
            boolean mult5 = (i % 5 == 0);

            if (mult3 && mult5) {
                results[i] = "FizzBuzz";
            } else if (mult3) {
                results[i] = "Fizz";
            } else if (mult5) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }
        for (int i = 0; i <= n; i++) {
            System.out.printf("Position %d = %s%n", i, results[i]);
        }
    }
}