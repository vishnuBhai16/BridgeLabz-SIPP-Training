package Day_5_String;

import java.util.Scanner;

public class VowelConsonantCount {
    static boolean isLetter(char c) {
        return (c>='a'&&c<='z')||(c>='A'&&c<='Z');
    }

    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return "aeiou".indexOf(c) >= 0;
    }

    static int[] countVC(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (isLetter(c)) {
                if (isVowel(c)) vowels++; else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Text: ");
        String text = sc.nextLine();
        int[] vc = countVC(text);
        System.out.printf("Vowels: %d, Consonants: %d%n", vc[0], vc[1]);
    }
}
