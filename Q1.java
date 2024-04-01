//Q1. Input a string of size n and Update all the odd positions in the string to character ‘#’. Consider 0-based
//indexing

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size of string: ");
        int n = scn.nextInt();

        StringBuilder sb = new StringBuilder();
        String s = "";

        System.out.println("enter string of size " +n);
        while(sb.length() != n) {
            s = scn.next();

            if(s.length() != n) {
                System.out.println("string is not of size " +n);
                System.out.println("re-enter entire string");
            }
            else {
                sb.append(s);
            }
        }

        System.out.println("input string is: " + sb);

        for (int i = 0; i < n; i++) {
            if(i % 2 == 1) {
                 sb.replace(i, i+1, "#");
            }
        }
        System.out.println("updated string is: " + sb);
    }
}
