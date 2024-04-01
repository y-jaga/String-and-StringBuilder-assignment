//Q7. Find the second largest digit in the string consisting of digits from ‘0’ to ‘9’

public class Q7 {
    public static void main(String[] args) {
        String s = "82537";
        int n = s.length();

        char maxNum = s.charAt(0);
        for(int i = 1; i < n; i++) {
            if(s.charAt(i) > maxNum) {
                maxNum = s.charAt(i);
            }
        }

        System.out.println(maxNum);
    }
}
