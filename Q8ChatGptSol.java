//Q8. Input a string and return the number of substrings that contain only vowels.

import java.util.Scanner;

public class Q8ChatGptSol {
    public static boolean checkVowelChar(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a string: ");
        String s = scn.nextLine();
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                String temp = s.substring(i,j);
                boolean isVowelChar = true;

                for(char ele : temp.toCharArray()) {
                    if(!checkVowelChar(ele)) {
                        isVowelChar = false;
                        break;
                    }
                }

                if(isVowelChar) {
                    count++;
                }
            }
        }
        System.out.println(count +" substrings that contains vowels");
    }
}
