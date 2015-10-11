package TwoStringsAreAnagrams;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	for(int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		if(!map.containsKey(c)) map.put(c, 1);
    		else map.put(c, map.get(c) + 1);
    	}
    	
    	for(int i = 0; i < t.length(); i++) {
    		char c = t.charAt(i);
    		if(!map.containsKey(c)) return false;
    		else {
    			map.put(c, map.get(c) - 1);
    			if(map.get(c) == 0) map.remove(c);
    		}
    	}
		return map.size() == 0;
    }
}
