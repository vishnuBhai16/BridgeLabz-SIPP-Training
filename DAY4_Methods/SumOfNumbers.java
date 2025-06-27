package Day_4_Methods;

import java.util.*;
public class SumOfNumbers {

    public static int sumOfNaturalNumbers(int n){
        int sum = 0;
        for(int i = 1; i < n; i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a naural number : ");
        int n = sc.nextInt();
        sumOfNaturalNumbers(n);
    }
}
