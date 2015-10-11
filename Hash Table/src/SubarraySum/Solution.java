package SubarraySum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    /** 
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
	private boolean find = false;
    public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(nums.length == 0) return res;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                res.add(i);
                res.add(i);
                return res;
            }
        	int[] arr = getSumMap(nums, i);
        	if(find) {
        		res.add(arr[0]);
        		res.add(arr[1]);
        		return res;
        	}
        }
        throw new IllegalArgumentException("");
    }

	private int[] getSumMap(int[] nums, int start) {
		// TODO Auto-generated method stub
		find = false;
		int[] arr = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
		for(int i = start; i < nums.length; i++) {
			sum += nums[i];
			if(!map.containsKey(0 - nums[i])) {
				map.clear();
				map.put(sum, i);
			}
			else {
				find = true;
				arr = new int[]{start, i};
				break;
			}
		}
		return arr;
	}
}
