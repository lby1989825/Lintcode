package RecoverRotatedSortedArray;

import java.util.ArrayList;

public class Solution {
    /**
     * @param nums: The rotated sorted array
     * @return: void
     */
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        // write your code
    	if(nums.size() == 0 || nums.size() == 1) return;
    	int i = 1;
    	while(i < nums.size()) {
    		if(nums.get(i - 1) - nums.get(i) > 0) break;
    		i++;
    	}
    	reverse(nums, 0, i - 1);
    	reverse(nums, i, nums.size() - 1);
    	reverse(nums, 0, nums.size() - 1);
    }
	private void reverse(ArrayList<Integer> nums, int i, int j) {
		while(i < j) {
			exch(nums, i++, j--);
		}
	}
	private void exch(ArrayList<Integer> nums, int i, int j) {
		// TODO Auto-generated method stub
		int temp = nums.get(i);
		nums.set(i, nums.get(j));
		nums.set(j, temp);
	}
}
