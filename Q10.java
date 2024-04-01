//Q10. Given a sentence ‘str’, return the word that is lexicographically maximum.

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a sentence: ");
        String sentence = scn.nextLine();

        String[] words = sentence.split(" "); //array of strings
        int n = words.length;

        String maxWord = words[0];
        for (int i = 1; i < n; i++) {
            maxWord = maxBetween(maxWord, words[i]);
        }


        System.out.println("lexicographically maximum word is: " +maxWord);
    }

    public static String maxBetween(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int n = Math.min(n1, n2);

        for (int i = 0; i < n; i++) {
            if(s1.charAt(i) < s2.charAt(i)) {
                return s2;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                return s1;
            }
        }
        if(n1 < n2) {
            return s2;
        } else if (n1 > n2) {
            return s1;
        }

        return "";
    }
}
