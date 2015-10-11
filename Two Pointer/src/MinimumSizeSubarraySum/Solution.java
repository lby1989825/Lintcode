package MinimumSizeSubarraySum;

public class Solution {
    /**
     * @param nums: an array of integers
     * @param s: an integer
     * @return: an integer representing the minimum size of subarray
     */
    public int minimumSize(int[] nums, int s) {
    	int[] sum = getSumArr(nums);
    	int len = sum.length, start = 0, end = 0, minLen = nums.length;
    	if(sum[len - 1] < s) return -1;
    	while(end < len) {
    		if(sum[end] >= s) break;
    		end++;
    	}
    	while(end < len) {
    		while(sum[end] - sum[start] > s) start++;
    		if(sum[end] - sum[start] <= s) minLen = Math.min(minLen, end - start + 1);
    		end++;
    	}
    	return minLen;
    }

	private int[] getSumArr(int[] nums) {
		// TODO Auto-generated method stub
		int[] sum = new int[nums.length + 1];
		sum[0] = 0;
		for(int i = 1; i < nums.length; i++) {
			sum[i] = sum[i - 1] + nums[i - 1];
		}
		return sum;
	}
}

