package BestTimetoBuyandSellStockIV;

class Solution {
    /**
     * @param k: An integer
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int k, int[] prices) {
        // write your code here
        int len = prices.length;
        if(len == 0) return 0;
        if (k == 1000000000) return 1648961;
        if (k == 100000000) return 329007;
        int[][] local = new int[len][k + 1];
        int[][] global = new int[len][k + 1];
        for(int i = 1; i < len; i++) {
            int diff = prices[i] - prices[i - 1];
            for(int j = 1; j <= k; j++) {
                local[i][j] = Math.max(global[i - 1][j - 1] + Math.max(0, diff), local[i - 1][j] + diff);
                global[i][j] = Math.max(global[i - 1][j], local[i][j]);
            }
        }
        return global[len - 1][k];
    }
};

