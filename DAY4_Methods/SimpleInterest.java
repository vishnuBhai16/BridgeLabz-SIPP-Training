package Day_4_Methods;

import java.util.*;
public class SimpleInterest {

    public static int calculateSimpleInterest(int principle, int rate, int time) {
        int SI = (principle * rate * time) / 100;
        return SI;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle: ");
        int principle = sc.nextInt();
        System.out.println("Enter the rate: ");
        int rate = sc.nextInt();
        System.out.println("Enter the time: ");
        int time = sc.nextInt();

        int si = calculateSimpleInterest(principle, rate, time);
        System.out.println("Simple Interest is: " + si);
        sc.close();
    }
}
