package DAY4_Methods;

import java.util.Scanner;

public class NumberOfRounds {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; 
        double distanceToRun = 5000; 
        return distanceToRun / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangle in meters: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangle in meters: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangle in meters: ");
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.printf("The athlete needs to complete approximately %.2f rounds to complete 5 km.%n", rounds);
    }
}