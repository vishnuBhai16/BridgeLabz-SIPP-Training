package WorkShop;
import java.util.Scanner;
class Main {
    public static int calculatefare(int distance, int time) {
        return ((distance * 10) + (1 * time));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int tr=0;
        while (true) {
            System.out.println("Do You Want to Continue Ride? yes or no");
            String str = sc.nextLine().trim().toLowerCase();
            if (str.equals("no")) {
                break;
            } else if (str.equals("yes")) {
                System.out.println("Enter Distance in km");
                int d = sc.nextInt();
                System.out.println("Enter Time In Minutes ");
                int t = sc.nextInt();
                sc.nextLine();
                int fare = calculatefare(d, t);
                total += fare;
                tr+=1;
            } else {
                System.out.println("Invalid input. Please enter yes or no.");
            }
        }
        System.out.println("Your Monthly Fare is : " + total);
        System.out.println("Total Rides ARE : "+tr);
        System.out.println("Average Fare Per Ride :"+total/tr);
        System.out.println("Have A GOOD DAY .");
        sc.close();
   }
}
