package BackpackII;

public class Solution {
    public int backPackII(int m, int[] A, int V[]) {
        // write your code here
    	int[][] dp = new int[A.length + 1][m + 1];
    	dp[0][0] = 0;
    	for(int i = 1; i <= A.length; i++) {
    		for(int j = 0; j <= m; j++) {
    			if(j - A[i - 1] >= 0) {
    				dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j] + V[i - 1]);
    			}
    			else dp[i][j] = dp[i - 1][j];
    		}
    	}
    	return dp[A.length][m];
    }
}
