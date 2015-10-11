package Candy;

public class Solution {
    /**
     * @param ratings Children's ratings
     * @return the minimum candies you must give
     */
    public int candy(int[] ratings) {
        // Write your code here
        int N = ratings.length;
        int[] nums = new int[N];
        nums[0] = 1;
        for(int i = 1; i < N; i++) {
        	if(ratings[i] - ratings[i - 1] > 0) nums[i] = nums[i - 1] + 1;
        	else nums[i] = 1;
        }
        int res = nums[nums.length - 1];
        for(int i = nums.length - 2; i > -1; i--) {
        	int cur = 1;
        	if(ratings[i] > ratings[i + 1]) cur = nums[i + 1] + 1;
        	res += Math.max(cur, nums[i]);
        	nums[i] = cur;
        }
        return res;
    }
}
