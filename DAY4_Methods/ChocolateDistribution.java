package DAY4_Methods;
import java.util.*;
public class ChocolateDistribution {

    public static int[] chocolatesForEachChild(int M, int N){
        int quotient = M / N;
        int remainder = M % N;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of chocolates : ");
        int N = sc.nextInt();
        System.out.println("enter number of children: ");
        int M = sc.nextInt();
        int[] result = chocolatesForEachChild(M, N);
        System.out.println("Each child gets " + result[0] + " chocolates, " + result[1] + " chocolates remain.");

        
    }
}
