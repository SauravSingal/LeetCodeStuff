https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

//1.Brute Force N2
class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        for(int i = 0; i < prices.length - 1; i++){
            for(int j = i + 1; j < prices.length;j++){
                res = Math.max(res, prices[j] - prices[i]);
            }
        }
        return res;
    }
}

//2. here we keep updating buy Price with the lowest price found and then compare it with later prices to find the profit each time the price is greater than buy price.
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = prices[0]; // we cannot set this as zero as then buy price is 0 which is best case for profit.

        for(int i = 0; i < prices.length; i++){
            if(buyPrice > prices[i]){
                buyPrice = prices[i];
            } else {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }
}