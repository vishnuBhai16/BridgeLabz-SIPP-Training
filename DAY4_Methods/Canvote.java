package DAY4_Methods;
import java.util.Scanner;
public class Canvote {
    public static boolean canStudentVote(int age) {
        if (age < 0) { // invalid input
            return false;
        }
        return age >= 18; // eligible if 18 or older
    }

    public static void main(String[] args) {
        final int TOTAL_STUDENTS = 10;
        int[] ages = new int[TOTAL_STUDENTS];
        Scanner scanner = new Scanner(System.in);

        // 1) Collect ages
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        System.out.println("\nVoting Eligibility Results");
        System.out.println("---------------------------");

        // 2) Check eligibility and display results
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            boolean canVote = canStudentVote(ages[i]);

            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age entered.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " (age " + ages[i] + "): Eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (age " + ages[i] + "): Not eligible to vote.");
            }
        }
    }
}
