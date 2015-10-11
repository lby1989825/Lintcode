package MinimumWindowSubstring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    /**
     * @param source: A string
     * @param target: A string
     * @return: A string denote the minimum window
     *          Return "" if there is no such a string
     */
	private List<Integer> indexList = new ArrayList<Integer>();
    public String minWindow(String source, String target) {
        // write your code
    	String minStr = source;
    	boolean find = false;
    	Map<Character, Integer> dic = new HashMap<Character, Integer>();
    	for(int i = 0; i < target.length(); i++) {
    		char c = target.charAt(i);
    		if(!dic.containsKey(c)) dic.put(c, 1);
    		else dic.put(c, dic.get(c) + 1);
    	}
    	
    	Map<Character, List<Integer>> map = new HashMap<Character, List<Integer>>();
    	for(int i = 0; i < source.length(); i++) {
    		char c = source.charAt(i);
    		if(dic.containsKey(c) && !map.containsKey(c)) {
    			indexList.add(i);
    			List<Integer> temp = new ArrayList<Integer>();
    			temp.add(i);
    			map.put(c, temp);
    			dic.put(c, dic.get(c) - 1);
    			if(dic.get(c) == 0) dic.remove(c);
    			if(dic.size() == 0) {
    				if(indexList.get(indexList.size() - 1) - indexList.get(0) + 1 < minStr.length()) {
    					minStr = source.substring(indexList.get(0), indexList.get(indexList.size() - 1) + 1);
        				find = true;
    				}
    				dic.put(source.charAt(indexList.get(0)), 1);
    				map.get(source.charAt(indexList.get(0))).remove(0);
    				if(map.get(source.charAt(indexList.get(0))).size() == 0) map.remove(source.charAt(indexList.get(0)));
    				indexList.remove(0);
    			}
    		}
    		else if(dic.containsKey(c) && map.containsKey(c)) {
    			indexList.add(i);
    			map.get(c).add(i);
    			dic.put(c, dic.get(c) - 1);
    			if(dic.get(c) == 0) dic.remove(c);
    			if(dic.size() == 0) {
    				if(indexList.get(indexList.size() - 1) - indexList.get(0) + 1 < minStr.length()) {
    					minStr = source.substring(indexList.get(0), indexList.get(indexList.size() - 1) + 1);
        				find = true;
    				}
    				dic.put(source.charAt(indexList.get(0)), 1);
    				map.get(source.charAt(indexList.get(0))).remove(0);
    				if(map.get(source.charAt(indexList.get(0))).size() == 0) map.remove(source.charAt(indexList.get(0)));
    				indexList.remove(0);
    			}
    		}
    		else if(!dic.containsKey(c) && map.containsKey(c)) {
    			int index = indexList.indexOf(map.get(c).get(0));
				indexList.remove(index);
				indexList.add(i);
				map.get(c).remove(0);
				map.get(c).add(i);
    		}
    	}
    	return find ? minStr : "";
    }
}
