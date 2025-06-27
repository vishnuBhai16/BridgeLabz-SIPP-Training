package Day_5_String;

import java.util.Scanner;
public class SubString {
    static String subStringManual(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < s.length(); i++)
            sb.append(s.charAt(i));
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
        System.out.print("Text   : "); String text = sc.next();
        System.out.print("Start  : "); int start = sc.nextInt();
        System.out.print("End    : "); int end   = sc.nextInt();
        String manual  = subStringManual(text, start, end);
        String builtIn = text.substring(start, end);
        System.out.println("Manual  : " + manual);
        System.out.println("Built-in: " + builtIn);
        System.out.println("Equal?  : " + equalStrings(manual, builtIn));
    }
}
