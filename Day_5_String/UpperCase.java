package Day_5_String;

import java.util.Scanner;
public class UpperCase {
    static String toUpperManual(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') c = (char)(c - 32);
            sb.append(c);
        }
        return sb.toString();
    }

    static boolean equalStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String text = sc.nextLine();
        String builtIn = text.toUpperCase();
        String manual  = toUpperManual(text);
        System.out.println("Built-in : " + builtIn);
        System.out.println("Manual   : " + manual);
        System.out.println("Equal?   : " + equalStrings(builtIn, manual));
        
    }
}
