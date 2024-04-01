//Q4. Input a string of even length and reverse the second half of the string

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter even length string: ");
        StringBuilder sb = new StringBuilder(scn.next());

        int n = sb.length();
        if(n % 2 == 1) {
            System.out.println("length of input string is odd");
            System.out.println("please re-run the program");
        } else {
            int st = n/2, end = n - 1;
            while(st <  end) {
                char c1 = sb.charAt(st);
                char c2 = sb.charAt(end);

                sb.replace(st, st+1, c2+"");
                sb.replace(end, end+1, c1+"");

                st++;
                end--;
            }
            System.out.println("answer is: " + sb);
        }
    }
}
