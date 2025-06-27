package Day_5_String;

import java.util.Scanner;
public class NumberFormat {
    static void generateNFE(String text) {
        System.out.println(Integer.parseInt(text));   // Fails if not numeric
    }

    static void handleNFE(String text) {
        try {
            System.out.println(Integer.parseInt(text));
        } catch (NumberFormatException nfe) {
            System.out.println("Handled NFE: " + nfe);
        } catch (RuntimeException re) {
            System.out.println("Generic runtime ex: " + re);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        String text = sc.nextLine();
        generateNFE(text);
        handleNFE(text);
    }
}
