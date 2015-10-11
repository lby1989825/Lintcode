package MaximumSubarrayII;

import java.util.ArrayList;

public class Solution {
    /**
     * @param nums: A list of integers
     * @return: An integer denotes the sum of max two non-overlapping subarrays
     */
    public int maxTwoSubArrays(ArrayList<Integer> nums) {
        // write your code
    	int res = Integer.MIN_VALUE;
    	for(int i = 1; i < nums.size(); i++) {
    		int sumLeft = getSum(nums, 0, i);
    		int sumRight = getSum(nums, i, nums.size());
    		res = Math.max(res, sumLeft + sumRight);
    	}
    	return res;
    }

	private int getSum(ArrayList<Integer> nums, int start, int end) {
		// TODO Auto-generated method stub
		int sum = nums.get(start), max = nums.get(start);
		for(int i = start + 1; i < end; i++) {
			sum = Math.max(sum + nums.get(i), nums.get(i));
			max = Math.max(max, sum);
		}
		return max;
	}
}
