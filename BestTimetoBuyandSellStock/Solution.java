package BestTimetoBuyandSellStock;

public class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
    	if(prices.length == 0 || prices.length == 1) return 0;
    	int[] profit = new int[prices.length - 1];
    	for(int i = 1; i < prices.length; i++) {
    		profit[i - 1] = prices[i] - prices[i - 1];
    	}
    	int sum = 0, max = 0;
    	for(int i = 0; i < profit.length; i++) {
    		sum = Math.max(sum + profit[i], profit[i]);
    		max = Math.max(max, sum);
    	}
    	return max;
    }
}
