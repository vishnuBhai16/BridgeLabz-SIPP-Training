package WorkShop;
import java.util.Scanner;
public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coffeeType;
        int quantity;
        double price = 0;
        final double GST_RATE = 0.18; // 18% GST

        System.out.println("Welcome to Ravi's Café!");

        while (true) {
            System.out.print("\nEnter coffee type (Espresso, Cappuccino, Latte, Americano) or type 'exit' to quit: ");
            coffeeType = sc.nextLine().trim().toLowerCase();

            if (coffeeType.equals("exit")) {
                System.out.println("Thank you for visiting Ravi's Café!");
                break;
            }

            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (coffeeType) {
                case "espresso":
                    price = 100;
                    break;
                case "cappuccino":
                    price = 120;
                    break;
                case "latte":
                    price = 150;
                    break;
                case "americano":
                    price = 130;
                    break;
                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    continue;
            }

            double total = price * quantity;
            double gst = total * GST_RATE;
            double finalBill = total + gst;

            System.out.println("----- Bill Summary -----");
            System.out.println("Coffee: " + coffeeType.substring(0, 1).toUpperCase() + coffeeType.substring(1));
            System.out.println("Quantity: " + quantity);
            System.out.println("Base Total: ₹" + total);
            System.out.println("GST (18%): ₹" + gst);
            System.out.println("Final Bill: ₹" + finalBill);
            System.out.println("------------------------");
        }

        sc.close();
    }
}

