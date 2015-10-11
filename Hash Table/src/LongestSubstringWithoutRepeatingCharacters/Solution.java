package LongestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    /**
     * @param s: a string
     * @return: an integer 
     */
	private int maxLen = 0;
	private int start = 0, end = 0;
    public int lengthOfLongestSubstring(String s) {
        // write your code here
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	while(end < s.length()) {
    		char c = s.charAt(end);
    		if(!map.containsKey(c)) {
    			map.put(c, end);
    			end++;
    			if(end == s.length()) maxLen = Math.max(maxLen, end - start);
    		}
    		else {
    			maxLen = Math.max(maxLen, end - start);
    			changeMap(map, c);
    			map.put(c, end);
    			end++;
    			if(end == s.length()) maxLen = Math.max(maxLen, end - start);
    		}
    	}
    	return maxLen;
    }
	private void changeMap(Map<Character, Integer> map, char c) {
		// TODO Auto-generated method stub
		List<Character> list = new ArrayList<Character>();
		int j = map.get(c);
		for(Character ch: map.keySet()) {
			if(map.get(ch) <= j) list.add(ch);
		}
		for(int i = 0; i < list.size(); i++) {
			map.remove(list.get(i));
		}
		start = j + 1;
	}
}
