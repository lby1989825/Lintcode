package MinimumPathSum;

public class Solution {
    /**
     * @param grid: a list of lists of integers.
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here
        if(grid.length == 0) return 0;
        int[][] sum = new int[grid.length][grid[0].length];
        sum[0][0] = grid[0][0];
        for(int i = 1; i < grid.length; i++) {
            sum[i][0] += sum[i - 1][0] + grid[i][0];
        }
        for(int j = 1; j < grid[0].length; j++) {
            sum[0][j] += sum[0][j - 1] + grid[0][j];
        }
        for(int i = 1; i < sum.length; i++) {
            for(int j = 1; j < sum[0].length; j++) {
                sum[i][j] = Math.min(sum[i - 1][j] + grid[i][j], sum[i][j - 1] + grid[i][j]);
            }
        }
        return sum[sum.length - 1][sum[0].length - 1];
    }
}

