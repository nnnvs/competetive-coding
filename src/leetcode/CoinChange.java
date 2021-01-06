package leetcode;

import java.util.Arrays;

public class CoinChange {

    public static int coinChange(int[] coins, int amount) {
        if(amount == 0) {return 0;}

        int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;

        for(int i=1;i<amount+1;i++){
            for(int coin:coins){
                if(i==coin){
                    dp[i]=1;
                } else if (i-coin>0){
                    if(dp[i-coin]<Integer.MAX_VALUE){
                        dp[i] = Math.min(dp[i-coin]+1,dp[i]);
                    }
                }
            }
        }

        for(int i=0;i<dp.length;i++){
            if(dp[i]==Integer.MAX_VALUE){
                dp[i]=-1;
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,5};
        System.out.println(coinChange(arr,11));

        arr = new int[]{2};
        System.out.println(coinChange(arr,3));

        arr = new int[]{1};
        System.out.println(coinChange(arr,0));

        arr = new int[]{1};
        System.out.println(coinChange(arr,1));

        arr = new int[]{1};
        System.out.println(coinChange(arr,2));
    }
}
