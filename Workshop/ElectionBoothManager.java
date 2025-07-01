package WorkShop;
import java.util.Scanner;
public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candidate1 = 0, candidate2 = 0, candidate3 = 0;
        System.out.println("Welcome to the Election Booth Manager!");
        System.out.println("Enter -1 as age to stop voting process.");
        while (true) {
            System.out.print("\nEnter your age: ");
            int age = sc.nextInt();
            if (age == -1) {
                System.out.println("Voting process ended.");
                break;
            }
            if (age < 18) {
                System.out.println("You are not eligible to vote.");
                continue;
            }
            System.out.println("You are eligible to vote.");
            System.out.println("Vote for your candidate:");
            System.out.println("1. Candidate A");
            System.out.println("2. Candidate B");
            System.out.println("3. Candidate C");
            System.out.print("Enter your choice (1/2/3): ");
            int vote = sc.nextInt();
            if (vote == 1) {
                candidate1++;
            } else if (vote == 2) {
                candidate2++;
            } else if (vote == 3) {
                candidate3++;
            } else {
                System.out.println("Invalid vote! Vote not recorded.");
            }
        }
        // Final Result
        System.out.println("\n----- Election Result Summary -----");
        System.out.println("Candidate A: " + candidate1 + " votes");
        System.out.println("Candidate B: " + candidate2 + " votes");
        System.out.println("Candidate C: " + candidate3 + " votes");

        // Winner logic (optional)
        if (candidate1 > candidate2 && candidate1 > candidate3) {
            System.out.println("Winner: Candidate A 🎉");
        } else if (candidate2 > candidate1 && candidate2 > candidate3) {
            System.out.println("Winner: Candidate B 🎉");
        } else if (candidate3 > candidate1 && candidate3 > candidate2) {
            System.out.println("Winner: Candidate C 🎉");
        } else {
            System.out.println("It's a tie!");
        }

        sc.close();
    }
}

