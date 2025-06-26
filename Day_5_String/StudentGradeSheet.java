package Day_5_String;

import java.util.Random;

public class StudentGradeSheet {
    public static void main(String[] args) {
        int n = 5;  // number of students
        Random rnd = new Random();

        System.out.printf("%-4s %-4s %-4s %-4s %-6s %-6s %-6s %-5s%n",
                "ID", "P", "C", "M", "Total", "Avg", "Pct", "Grade");
        System.out.println("-----");

        for (int i = 1; i <= n; i++) {
            int p = rnd.nextInt(91) + 10;
            int c = rnd.nextInt(91) + 10;
            int m = rnd.nextInt(91) + 10;

            int total = p + c + m;
            double avg = total / 3.0;
            double pct = Math.round(avg * 100.0) / 100.0;

            String grade = pct >= 90 ? "A+" :
                           pct >= 80 ? "A"  :
                           pct >= 70 ? "B"  :
                           pct >= 60 ? "C"  :
                           pct >= 50 ? "D"  : "F";

            System.out.printf("%-4d %-4d %-4d %-4d %-6d %-6.2f %-6.2f %-5s%n",
                    i, p, c, m, total, avg, pct, grade);
        }
    }
}
