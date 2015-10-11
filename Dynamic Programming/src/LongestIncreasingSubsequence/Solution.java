package LongestIncreasingSubsequence;

public class Solution {
    /**
     * @param nums: The integer array
     * @return: The length of LIS (longest increasing subsequence)
     */
    public int longestIncreasingSubsequence(int[] nums) {
        // write your code here
    	int maxLen = 0;
    	for(int i = 0; i < nums.length; i++) {
    		int num = nums[i];
    		int[] dp = new int[nums.length - i];
    		dp[0] = 1;
    		for(int j = 1; j < dp.length; j++) {
    			if(nums[i + j] > num) {
    				dp[j] = dp[j - 1] + 1;
    				num = nums[i + j];
    			}
    			else dp[j] = dp[j - 1];
    		}
    		maxLen = Math.max(maxLen, dp[dp.length - 1]);
    	}
        return maxLen;
    }
}


