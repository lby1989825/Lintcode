package LongestConsecutiveSequence;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * @param nums: A list of integers
     * @return an integer
     */
    public int longestConsecutive(int[] num) {
        // write you code here
    	int maxLen = 0;
    	Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    	for(int i = 0; i < num.length; i++) map.put(num[i], true);
    	for(int i = 0; i < num.length; i++) {
    		if(!map.get(num[i])) continue;
    		int len = 1;
    		for(int j = num[i] + 1;;j++) {
    			if(map.containsKey(j)) {
    				len++;
    				map.put(j, false);
    			}
    			else break;
    		}
    		for(int j = num[i] - 1;;j--) {
    			if(map.containsKey(j)) {
    				len++;
    				map.put(j, false);
    			}
    			else break;
    		}
    		maxLen = Math.max(maxLen, len);
    	}
    	return maxLen;
    }
}
