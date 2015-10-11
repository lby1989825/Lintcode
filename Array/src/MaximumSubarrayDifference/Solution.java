package MaximumSubarrayDifference;

import java.util.ArrayList;

public class Solution {
    /**
     * @param nums: A list of integers
     * @return: An integer indicate the value of maximum difference between two
     *          Subarrays
     */
	public int maxDiffSubArrays(ArrayList<Integer> nums) {
        // write your code
		int sz = nums.size(), finalMax = Integer.MIN_VALUE;
		for(int i = 1; i < sz; i++) {
			int leftMax = getMax(nums, 0, i), rightMin = getMin(nums, i, sz);
			int leftMin = getMin(nums, 0, i), rightMax = getMax(nums, i, sz);
			finalMax = max(Math.abs(leftMax - rightMin), Math.abs(rightMax - leftMin), finalMax);
		}
		return finalMax;
    }

	private int max(int a, int b, int c) {
		// TODO Auto-generated method stub
		return Math.max(a, Math.max(b, c));
	}

	private int getMax(ArrayList<Integer> nums, int start, int end) {
		// TODO Auto-generated method stub
		int sum = 0, max = Integer.MIN_VALUE;
		for(int i = start; i < end; i++) {
			sum = Math.max(sum + nums.get(i), nums.get(i));
			max = Math.max(sum, max);
		}
		return max;
	}

	private int getMin(ArrayList<Integer> nums, int start, int end) {
		// TODO Auto-generated method stub
		int sum = 0, min = Integer.MAX_VALUE;
		for(int i = start; i < end; i++) {
			sum = Math.min(sum + nums.get(i), nums.get(i));
			min = Math.min(sum, min);
		}
		return min;
	}
}
