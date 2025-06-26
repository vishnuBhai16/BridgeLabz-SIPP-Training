package Day_5_String;

import java.util.Scanner;

public class SplitCompare {

    static int strLength(String s) { int l = 0; for (char ignored : s.toCharArray()) l++; return l; }

    static String[] splitManual(String text) {
        int count = 1;                         
        for (char c : text.toCharArray()) if (c == ' ') count++;
        int[] spaceIdx = new int[count-1];     
        int idx = 0;
        for (int i = 0; i < strLength(text); i++)
            if (text.charAt(i) == ' ') spaceIdx[idx++] = i;

        String[] words = new String[count];
        int start = 0;
        for (int i = 0; i < count-1; i++) {
            words[i] = text.substring(start, spaceIdx[i]);
            start = spaceIdx[i] + 1;
        }
        words[count-1] = text.substring(start);
        return words;
    }

    static boolean equalArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sentence: ");
        String text = sc.nextLine();

        String[] manual = splitManual(text);
        String[] built  = text.split(" ");

        System.out.println("Equal? " + equalArrays(manual, built));
    }
}
