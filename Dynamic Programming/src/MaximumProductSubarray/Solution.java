package MaximumProductSubarray;

public class Solution {
    /**
     * @param nums: an array of integers
     * @return: an integer
     */
    public int maxProduct(int[] nums) {
        // write your code here
    	int max = nums[0], min = nums[0], finalMax = nums[0];
    	for(int i = 1; i < nums.length; i++) {
    		int mm = max, mn = min;
    		max = max(mm * nums[i], mn * nums[i], nums[i]);
    		min = min(mm * nums[i], mn * nums[i], nums[i]);
    		finalMax = Math.max(max, finalMax);
    	}
    	return finalMax;
    }
    
    private int min(int i, int j, int k) {
    	return Math.min(i, Math.min(j, k));
    }
    
    private int max(int i, int j, int k) {
    	return Math.max(i, Math.max(j, k));
    }
}
