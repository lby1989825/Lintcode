package RemoveDuplicatesfromSortedArray;

public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
    	if(nums.length == 0 || nums.length == 1) return nums.length;
        int i = 0, j = 0;
        while(j < nums.length) {
        	if(nums[i] == nums[j]) j++;
        	else {
        		nums[++i] = nums[j++];
        	}
        }
        return i + 1;
    }
}
