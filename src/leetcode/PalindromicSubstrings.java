package leetcode;

public class PalindromicSubstrings {

    public static int countSubstrings(String s) {
        int n=s.length();
        boolean[][] dp = new boolean[n][n] ;
        int c = 0;

        for(int i=0;i<n;i++){
            dp[i][i] = true;
        }

        for(int i=0;i<n-1;i++){
            dp[i][i+1] = s.charAt(i)==s.charAt(i+1);
            c += (dp[i][i+1] ? 1 : 0);
        }

        for(int len=3;len<n+1;len++){
            for(int i=0,j=i+len-1;j<n;i++,j++){
                dp[i][j] = s.charAt(i)==s.charAt(j) && dp[i+1][j-1];
                c += (dp[i][j] ? 1 : 0);
            }
        }
        return c+n;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));
        System.out.println(countSubstrings("aaa"));
    }
}
