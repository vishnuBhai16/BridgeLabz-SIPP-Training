package Day_5_String;

import java.util.Scanner;

public class WordsAndLengths {

    static String[] splitWords(String text) {
        StringBuilder word = new StringBuilder();
        java.util.List<String> list = new java.util.ArrayList<>();
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                if (word.length() > 0) { list.add(word.toString()); word.setLength(0); }
            } else word.append(c);
        }
        if (word.length() > 0) list.add(word.toString());
        return list.toArray(new String[0]);
    }

    static int length(String s) { return s.toCharArray().length; }

    static String[][] wordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(length(words[i]));
        }
        return table;
    }

    static void printTable(String[][] tbl) {
        System.out.printf("%-15s %-5s%n","Word","Len");
        for (String[] row : tbl)
            System.out.printf("%-15s %-5d%n", row[0], Integer.parseInt(row[1]));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sentence: ");
        String text = sc.nextLine();
        printTable(wordLengthTable(splitWords(text)));
        sc.close();
    }
}
