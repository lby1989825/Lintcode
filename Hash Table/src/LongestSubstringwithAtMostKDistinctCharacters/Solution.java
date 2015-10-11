package LongestSubstringwithAtMostKDistinctCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    /**
     * @param s : A string
     * @return : The length of the longest substring 
     *           that contains at most k distinct characters.
     */
	private int maxLen = 0;
	private int start = 0, end = 0;
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        // write your code here
    	Map<Character, List<Integer>> map = new HashMap<Character, List<Integer>>();
    	while(end < s.length()) {
    		char c = s.charAt(end);
    		if(map.containsKey(c)) {
    			map.get(c).add(end);
    			end++;
    			if(end == s.length()) maxLen = Math.max(maxLen, end - start);
    		}
    		else {
    			if(map.size() < k) {
    				List<Integer> list = new ArrayList<Integer>();
    				list.add(end);
    				map.put(c, list);
    			}
    			else {
    				maxLen = Math.max(maxLen, end - start);
    				changeMap(map);
    				List<Integer> list = new ArrayList<Integer>();
    				list.add(end);
    				map.put(c, list);
    			}
    			end++;
    		}
    	}
    	return maxLen;
    }

	private void changeMap(Map<Character, List<Integer>> map) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		char minChar = 'a';
		for(Character c: map.keySet()) {
			List<Integer> list = map.get(c);
			if(list.get(list.size() - 1) < min) {
				min = list.get(list.size() - 1);
				minChar = c;
			}
		}
		map.remove(minChar);
		start = min + 1;
	}
}
