package SortColors;

class Solution {
    /**
     * @param nums: A list of integer which is 0, 1 or 2 
     * @return: nothing
     */
    public void sortColors(int[] nums) {
        // write your code here
    	int j = 0;
    	while(nums[j] == 0) j++;
    	for(int i = j + 1; i < nums.length; i++) {
    		if(nums[i] == 0) {
    			exch(nums, i, j);
    			while(nums[j] == 0) j++;
    		}
    	}
    	while(nums[j] == 1) j++;
    	for(int i = j + 1; i < nums.length && i > j; i++) {
    		if(nums[i] == 1) {
    			exch(nums, i, j);
    			while(nums[j] == 1) j++;
    		}
    	}
    }

	private void exch(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
