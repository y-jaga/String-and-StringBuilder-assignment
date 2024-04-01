//3. Check whether the given string is palindrome or not.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a string: ");
        StringBuilder sb = new StringBuilder(scn.nextLine());
        int n = sb.length();
        boolean isPalindrome = true;


        for (int i = 0; i < n/2; i++) {
            if(sb.charAt(i) != sb.charAt(n-i-1)) {
                isPalindrome = false;
            }
        }

        if(isPalindrome) {
            System.out.println("input string is a palindrome");
        } else {
            System.out.println("input string is not a palindrome");
        }
    }
}
