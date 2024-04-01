//Q5. Input a string of length less than 10 and convert it into integer without using builtin function.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter integer string of length less then 10: ");
        StringBuilder sb = new StringBuilder(scn.next());
        int n = sb.length();
        int num = 0;

        if(n > 10) {
            System.out.println("length of input string is greater then 10");
            System.out.println("please re-run the program");
        }
        else {
            for (int i = 0; i < n; i++) {
                int x = sb.charAt(i) - '0';
                num = num * 10 + x;
            }
            System.out.println("integer string converted to integer successfully");
            System.out.println("subtracting 1 to integer " +(num-1));
        }
    }
}
