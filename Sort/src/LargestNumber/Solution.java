package LargestNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    /**
     *@param num: A list of non negative integers
     *@return: A string
     */
    public String largestNumber(int[] num) {
        // write your code here
    	List<String> list = new ArrayList<String>();
    	for(int i = 0; i < num.length; i++) {
    		list.add(String.valueOf(num[i]));
    	}
    	Collections.sort(list, new StringComparator());
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < list.size(); i++) {
    		sb.append(list.get(i));
    	}
    	if(sb.charAt(0) == '0') sb = new StringBuilder("0");
    	return sb.toString();
    }
}