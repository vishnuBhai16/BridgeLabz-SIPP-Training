package Day_4_Methods;

import java.util.*;

public class QuotientRemainder {

    public static int[]findRemainderAndQuotient(int number,int divisor){
        int remainder = number % divisor;
        int quotient = number / divisor;

        return new int[]{remainder,quotient};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int number = sc.nextInt();
        System.out.print("enter the divisor : ");
        int divisor = sc.nextInt();

        int[] arr = findRemainderAndQuotient(number,divisor);
        System.out.println("Remainder: " + arr[0]);
        System.out.println("Quotient: " + arr[1]);

    }
}
