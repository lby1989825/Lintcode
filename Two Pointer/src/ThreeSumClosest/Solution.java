package ThreeSumClosest;

import java.util.Arrays;

public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target : An integer
     * @return : return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers ,int target) {
        // write your code here
    	int res = 0, min = Integer.MAX_VALUE;
    	Arrays.sort(numbers);
    	for(int i = 0; i < numbers.length; i++) {
    		int should = target - numbers[i];
    		int j = i + 1, k = numbers.length - 1;
    		while(j < k) {
    			int cur = numbers[j] + numbers[k];
    			if(cur < should) j++;
    			else if(cur > should) k--;
    			else return target;
    			if(Math.abs(cur + numbers[i] - target) < min) {
    				min = Math.abs(cur + numbers[i] - target);
    				res = cur + numbers[i];
    			}
    		}
    	}
    	return res;
    }
}
