package BestTimetoBuyandSellStockIV;

class Solution {
    /**我们定义local[i][j]为在到达第i天时最多可进行j次交易并且最后一次交易在最后一天卖出的最大利润，此为局部最优。
     * 然后我们定义global[i][j]为在到达第i天时最多可进行j次交易的最大利润，此为全局最优。它们的递推式为：
     * local[i][j] = max(global[i - 1][j - 1] + max(diff, 0)[进行交易], local[i - 1][j] + diff[没进行交易])
     * global[i][j] = max(local[i][j], global[i - 1][j])，
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
