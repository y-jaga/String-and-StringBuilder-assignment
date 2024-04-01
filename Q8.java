//Q8. Input a string and return the number of substrings that contain only vowels.

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a string: ");
        String s = scn.nextLine();
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String temp = s.substring(i,j+1);
                if(isVowel(temp)) {
                    count++;
                } else {
                    break;
                }
            }
        }
        System.out.println(count +" substrings that contains vowels");
    }

    private static boolean isVowel(String temp) {
        int n = temp.length();
        boolean check = false;

        for (int i = 0; i < n; i++) {
            if(temp.charAt(i) == 'A' || temp.charAt(i) == 'a') {
                check = true;
            }
            else if(temp.charAt(i) == 'E' || temp.charAt(i) == 'e') {
                check = true;
            }
            else if(temp.charAt(i) == 'I' || temp.charAt(i) == 'i') {
                check = true;
            }
            else if(temp.charAt(i) == 'O' || temp.charAt(i) == 'o') {
                check = true;
            }
            else if(temp.charAt(i) == 'U' || temp.charAt(i) == 'u') {
                check = true;
            }
            else {
                check = false;
            }

            if(!check) {
                return false;
            }
        }

        return check;
    }
}
