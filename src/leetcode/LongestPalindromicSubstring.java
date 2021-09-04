package leetcode;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        int n = s.length();
        int maxLength = Integer.MIN_VALUE;
        String maxString = "";
        boolean[][] dp = new boolean[n][n];

        for(int i=0;i<n;i++){
            dp[i][i] = true;
            maxLength = 1;
            maxString = s.substring(i,i+1);
        }

        for(int i=0;i<n-1;i++){
            dp[i][i+1] = s.charAt(i)==s.charAt(i+1);
            if(dp[i][i+1]){
                maxLength = 2;
                maxString = s.substring(i,i+2);
            }
        }

        for(int len=3;len<n+1;len++){
            for(int i=0,j=i+len-1;j<n;i++,j++){
                dp[i][j] = s.charAt(i)==s.charAt(j) && dp[i+1][j-1];
                if(dp[i][j] && len>maxLength){
                    maxString = s.substring(i,j+1);
                }
            }
        }

        return maxString;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("ac"));
        System.out.println(longestPalindrome("abcdefgh"));
    }
}
