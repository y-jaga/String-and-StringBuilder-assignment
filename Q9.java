//Q9. Given an array of strings. Check whether they are anagram or not.

import java.util.Arrays;
import java.util.Scanner;

public class Q9 {
    public static boolean checkStrings(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        int n = s1.length();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < n; i++) {
            if(ch1[i] != ch2[i])
                return false;
        }
        return true;
    }
    public static boolean checkAnagram(String[] str) {
        int n = str.length;
        String cmp = str[0];
        for (int i = 1; i < n; i++) {
            if(!checkStrings(cmp, str[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size: ");
        int n = scn.nextInt();
        String[] str = new String[n];

        System.out.println("enter strings in array: ");
        for (int i = 0; i < n; i++) {
            str[i] = scn.next();
        }

        if(checkAnagram(str)) {
            System.out.println("all strings are anagram");
        }
        else {
            System.out.println("all strings are not anagram");
        }
        System.out.println();
    }
}
