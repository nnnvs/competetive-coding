package leetcode;

public class BestTimetoBuyandSellStock {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0;i<prices.length-1;i++){
            int buy = prices[i];
            int profit = 0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>buy){
                    profit = prices[j]-buy;
                    if(profit>maxProfit){
                        maxProfit = profit;
                    }
                }
            }
        }
        return maxProfit;
    }


    public static int maxProfitOnePass(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(minPrice>prices[i]){
                minPrice = prices[i];
            } else if(prices[i]-minPrice>maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] data = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfitOnePass(data));

        data = new int[]{7,6,4,3,1};
        System.out.println(maxProfitOnePass(data));

        data = new int[]{4,2,5,8,1,3};
        System.out.println(maxProfitOnePass(data));
    }
}
