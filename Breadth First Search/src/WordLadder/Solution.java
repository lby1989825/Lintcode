package WordLadder;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
    /**
      * @param start, a string
      * @param end, a string
      * @param dict, a set of string
      * @return an integer
      */
    public int ladderLength(String start, String end, Set<String> dict) {
        // write your code here
    	Queue<String> strQueue = new LinkedList<String>();
    	Queue<Integer> lenQueue = new LinkedList<Integer>();
    	strQueue.add(start);
    	lenQueue.add(1);
        while(!strQueue.isEmpty()) {
        	String curStr = strQueue.poll();
        	int curLen = lenQueue.poll();
        	if(curStr.equals(end)) return curLen;
        	for(int i = 0; i < curStr.length(); i++) {
        		char[] cur = curStr.toCharArray();
        		for(char c = 'a'; c < 'z'; c++) {
        			if(cur[i] == c) continue;
    				cur[i] = c;
    				String tempStr = new String(cur);
    				if(dict.contains(tempStr)) {
    					strQueue.add(tempStr);
    					lenQueue.add(curLen + 1);
    					dict.remove(tempStr);
    				}
        		}
        	}
        }
        return 0;
    }
}
