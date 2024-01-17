package ValidPalindrome;

public class Solution {
    public static void main (String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        s = "race a car";
        System.out.println(isPalindrome(s));
        s = " ";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char start = s.charAt(i);
            char end = s.charAt(j);
            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }
            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
