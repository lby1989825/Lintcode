package BestTimetoBuyandSellStockIII;

class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
    	int N = prices.length;
    	int min = prices[0], max = prices[prices.length - 1];
    	int[] left = new int[N];
    	left[0] = 0;
    	for(int i = 1; i < N; i++) {
    		min = Math.min(min, prices[i]);
    		left[i] = Math.max(prices[i] - min, left[i - 1]);
    	}
    	int[] right = new int[N];
    	right[N - 1] = 0;
    	for(int i = N - 2; i > -1; i--) {
    		max = Math.max(max, prices[i]);
    		right[i] = Math.max(max - prices[i], right[i + 1]);
    	}
    	int profit = 0;
    	for(int i = 0; i < N; i++) {
    		profit = Math.max(profit, left[i] + right[i]);
    	}
    	return profit;
    }
};

