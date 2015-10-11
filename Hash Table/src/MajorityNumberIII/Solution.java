package MajorityNumberIII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * @param nums: A list of integers
     * @param k: As described
     * @return: The majority number
     */
    public int majorityNumber(ArrayList<Integer> nums, int k) {
        // write your code
    	int sz = nums.size();
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i = 0; i < nums.size(); i++) {
    		if(!map.containsKey(nums.get(i))) {
    			map.put(nums.get(i), 1);
    			if(map.get(nums.get(i)) > sz / k) return nums.get(i);
    		}
    		else {
    			map.put(nums.get(i), map.get(nums.get(i)) + 1);
    			if(map.get(nums.get(i)) > sz / k) return nums.get(i);
    		}

    	}
    	throw new IllegalArgumentException();
    }
}
