package Day_5_String;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine().toLowerCase();   // work in lowercase

        System.out.printf("%-5s %-12s%n", "Char", "Type");
        System.out.println("----------------");

        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                String type = "aeiou".indexOf(c) >= 0 ? "Vowel" : "Consonant";
                System.out.printf("%-5c %-12s%n", c, type);
            } else {
                System.out.printf("%-5c %-12s%n", c, "Not a Letter");
            }
        }
    }
}
