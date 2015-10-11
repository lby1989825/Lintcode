package LongestCommonSubstring;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        // write your code here
    	int len = Math.min(A.length(), B.length());
    	for(int i = len; i > -1; i--) {
    		Set<String> set = getSubStringSet(A, i);
    		for(int j = 0; j + i <= B.length(); j++) {
    			String str = B.substring(j, j + i);
    			if(set.contains(str)) return i;
    		}
    	}
    	return 0;
    }

	private Set<String> getSubStringSet(String A, int len) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		for(int i = 0; i + len <= A.length(); i++) {
			String str = A.substring(i, i + len);
			set.add(str);
		}
		return set;
	}
}
