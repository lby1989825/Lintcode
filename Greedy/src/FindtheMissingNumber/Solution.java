package FindtheMissingNumber;

public class Solution {
    /**    
     * @param nums: an array of integers
     * @return: an integer
     */
	public int findMissing(int[] nums) {
        // write your code here
    	for(int i = 0; i < nums.length; i++) {
    	    if(nums[i] < nums.length && nums[i] != i) exch(nums, nums[i], i);
    	}
    	for(int i = nums.length - 1; i > -1; i--) {
    		if(nums[i] < nums.length && nums[i] != i) exch(nums, nums[i], i);
    	}
    	if(nums[0] < nums.length && nums[0] != 0) exch(nums, 0, nums[0]);
    	if(nums[nums.length - 1] < nums.length && nums[nums.length - 1] != nums.length - 1) exch(nums, nums[nums.length - 1], nums.length - 1);
    	for(int i = 0; i < nums.length; i++) {
    	    if(nums[i] != i) return i;
    	}
    	return nums.length;
    }

	private void exch(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
