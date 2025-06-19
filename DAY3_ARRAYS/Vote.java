import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of Student " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < 10; i++) {
            if (arr[i] >= 18) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Sorry! Student " + (i + 1) + " can't vote.");
            }
        }
        sc.close();
    }
}
