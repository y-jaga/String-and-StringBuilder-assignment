//Q2. Input a string of length n and count all the consonants in the given string

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a string: ");
        StringBuilder sb = new StringBuilder(scn.nextLine());
        int n = sb.length();
        int res = 0;

        for (int i = 0; i < n; i++) {
            res = countVowels(sb);
        }
        System.out.println("consonents in input strings are: " +(n - res));
    }

    private static int countVowels(StringBuilder sb) {
        int n = sb.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(sb.charAt(i) == 'a' || sb.charAt(i) == 'A')
                count++;

            else if(sb.charAt(i) == 'e' || sb.charAt(i) == 'E')
                count++;

            else if(sb.charAt(i) == 'i' || sb.charAt(i) == 'I')
                count++;

            else if(sb.charAt(i) == 'o' || sb.charAt(i) == 'O')
                count++;

            else if(sb.charAt(i) == 'u' || sb.charAt(i) == 'U')
                count++;
        }
        return count;
    }
}
