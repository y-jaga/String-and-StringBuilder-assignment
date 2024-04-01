//Q6. Input a string and concatenate with its reverse string and print it

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = scn.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println("before append: ");
        System.out.println(str);

        str = str + sb.reverse().toString();

        System.out.println("after append: ");
        System.out.println(str);
    }

}
