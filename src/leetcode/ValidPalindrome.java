package leetcode;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int l = 0;
        int r = s.length() -1;

        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }
}
