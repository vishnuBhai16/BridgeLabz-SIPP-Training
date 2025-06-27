package Day_5_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShortestLongestWord {
    static String[] splitWords(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (sb.length() > 0) { words.add(sb.toString()); sb.setLength(0); }
            } else sb.append(c);
        }
        if (sb.length() > 0) words.add(sb.toString());
        return words.toArray(new String[0]);
    }

    static int len(String s) { int l = 0; for (char c : s.toCharArray()) l++; return l; }

    static String[][] wordLengths(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(len(words[i]));
        }
        return arr;
    }

    static int[] shortestLongest(String[][] table) {
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < table.length; i++) {
            int l = Integer.parseInt(table[i][1]);
            if (l < Integer.parseInt(table[minIdx][1])) minIdx = i;
            if (l > Integer.parseInt(table[maxIdx][1])) maxIdx = i;
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sentence: ");
        String text = sc.nextLine();
        String[] words   = splitWords(text);
        String[][] table = wordLengths(words);
        int[] idx        = shortestLongest(table);

        System.out.printf("%-15s %-5s%n", "Word", "Len");
        System.out.println("-----------------------");
        for (String[] row : table)
            System.out.printf("%-15s %-5s%n", row[0], row[1]);

        System.out.printf("%nShortest: %s%n", table[idx[0]][0]);
        System.out.printf("Longest : %s%n", table[idx[1]][0]);
        
    }
}
