package BestTimetoBuyandSellStockIII;

class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
    	int min = prices[0], max = prices[prices.length - 1];
        int[] left = new int[prices.length];
        left[0] = 0;
        for(int i = 1; i < prices.length; i++) {
        	min = Math.min(prices[i], min);
        	left[i] = Math.max(prices[i] - min, left[i - 1]);
        }
        int[] right = new int[prices.length];
        right[right.length - 1] = 0;
        for(int i = prices.length - 2; i > -1; i--) {
        	max = Math.max(prices[i], max);
        	right[i] = Math.max(max - prices[i], right[i + 1]);
        }
        int profit = 0;
        for(int i = 0; i < prices.length; i++) {
            profit = Math.max(profit, left[i] + right[i]);
        }
        return profit;
    }
};
