package BinarySearch;

class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
        int lo = 0, hi = nums.length - 1;
        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if(nums[mid] > target) hi = mid - 1;
            else if(nums[mid] < target) lo = mid + 1;
            else return getSmallestIndex(nums, mid);
        }
        return -1;
    }
    
    private int getSmallestIndex(int[] nums, int index) {
        while(index > 0 && nums[index] == nums[index - 1]) index--;
        return index;
    }
}