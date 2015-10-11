package PalindromePartitioning;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * @param s: A string
     * @return: A list of lists of string
     */
    public List<List<String>> partition(String s) {
        // write your code here
    	List<List<String>> res = new ArrayList<List<String>>();
    	if(s.length() == 0) return res;
    	List<String> list = new ArrayList<String>();
    	helper(s, list, res);
    	return res;
    }

	private void helper(String s, List<String> list, List<List<String>> res) {
		// TODO Auto-generated method stub
		if(s.length() == 0) {
			res.add(new ArrayList<String>(list));
			return;
		}
		for(int i = 0; i < s.length(); i++) {
			String str = s.substring(0, i + 1);
			if(isPalindrom(str)) {
				list.add(str);
				helper(s.substring(i + 1), list, res);
				list.remove(list.size() - 1);
			}
		}
	}

	private boolean isPalindrom(String str) {
		// TODO Auto-generated method stub
		int i = 0, j = str.length() - 1;
		while(i <= j) {
			if(str.charAt(i) != str.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
}
