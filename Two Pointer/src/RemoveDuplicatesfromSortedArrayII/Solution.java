package RemoveDuplicatesfromSortedArrayII;

public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
    	if(nums.length == 0 || nums.length == 1) return nums.length;
    	int i = 0, j = 1, flag = 0;
        while(j < nums.length) {
        	if(nums[i] == nums[j] && flag == 0) {
        		flag = 1;
        		nums[++i] = nums[j++];
        	}
        	else if(nums[i] == nums[j] && flag == 1) {
        		j++;
        	}
        	else {
        		flag = 0;
        		nums[++i] = nums[j++];
        	}
        }
        return i + 1;
    }
}
