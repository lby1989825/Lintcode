package PartitionArray;

public class Solution {
	/** 
     *@param nums: The integer array you should partition
     *@param k: As description
     *return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
	    //write your code here
    	int i = 0, j = nums.length - 1;
    	while(i < j) {
    		while(i < nums.length && nums[i] < k) i++;
    		while(j > -1 && nums[j] >= k) j--;
    		if(j < i) break;
    		exch(nums, i++, j--);
    	}
    	return i;
    }

	private void exch(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
		
	}
}
