package Day_4_Methods;

import java.util.Scanner;

public class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }
        if (month == 4 && day >= 1 && day <= 30) {
            return true;
        }
        if (month == 5 && day >= 1 && day <= 31) {
            return true;
        }
        if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the month : ");
        int month = sc.nextInt();
        System.out.println("enter the day : ");
        int day = sc.nextInt();


        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}