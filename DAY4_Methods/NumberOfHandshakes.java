package DAY4_Methods;
import java.util.*;
public class NumberOfHandshakes {

    public static int numberOfStudents(int n){
        int combination = (n*(n-1))/2;
        return combination;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of students : ");
        int n = sc.nextInt();
        numberOfStudents(n);
    }
}
