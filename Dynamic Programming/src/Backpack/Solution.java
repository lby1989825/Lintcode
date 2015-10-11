package Backpack;


public class Solution {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
    public int backPack(int m, int[] A) {
    	if(A.length == 0) return 0;
    	//from item i, can get sum j?
    	boolean[] dp = new boolean[m + 1];
    	dp[0] = true;
    	for(int i = 1; i <= A.length; i++) {
    		for(int j = m; j > -1; j--) {
    			if(j - A[i - 1] >= 0 && dp[j - A[i - 1]]) {
    				dp[j] = dp[j - A[i - 1]];
    			}
    		}
    	}
    	for(int i = m; i > -1; i--) {
    		if(dp[i]) return i;
    	}
    	return 0;
    }
}
