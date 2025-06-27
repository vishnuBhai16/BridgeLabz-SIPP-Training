package Day_4_Methods;

import java.util.*;
public class TrigoFunction {
    public static double[] calculateTrigonometricFunctions(double angleDeg) {
        double angleRad = Math.toRadians(angleDeg);   // convert to radians

        double sin = Math.sin(angleRad);
        double cos = Math.cos(angleRad);
        double tan = Math.tan(angleRad);              // relies on cos() ≠ 0

        return new double[] { sin, cos, tan };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] trigValues = calculateTrigonometricFunctions(angle);
        System.out.printf("sin(%.2f°) = %.6f%n", angle, trigValues[0]);
        System.out.printf("cos(%.2f°) = %.6f%n", angle, trigValues[1]);

        // Handle the tan output neatly if cosine is extremely close to 0
        if (Math.abs(trigValues[1]) < 1e-12) {
            System.out.printf("tan(%.2f°) is undefined (cosine ~ 0)%n", angle);
        } else {
            System.out.printf("tan(%.2f°) = %.6f%n", angle, trigValues[2]);
        }
    }
}
