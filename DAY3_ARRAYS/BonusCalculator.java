import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        int[] serviceYears = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter years of service: ");
            serviceYears[i] = sc.nextInt();

            if (salary[i] < 0 || serviceYears[i] < 0) {
                System.out.println("Invalid input, please re-enter.");
                i--;
                continue;
            }

            double rate = (serviceYears[i] > 5) ? 0.05 : 0.02;
            bonus[i] = salary[i] * rate;
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

    }
}