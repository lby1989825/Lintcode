package LongestCommonPrefix;

public class Solution {
    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        // write your code here
    	if(strs.length == 0) return "";
    	String str = findMinLen(strs);
    	for(int i = 0; i < str.length(); i++) {
    		String prefix = str.substring(0, i + 1);
    		if(AllPrefix(prefix, strs)) continue;
    		else return prefix.substring(0, prefix.length() - 1);
    	}
		return str;
    }

	private boolean AllPrefix(String prefix, String[] strs) {
		// TODO Auto-generated method stub
		int len = prefix.length();
		for(int i = 0; i < strs.length; i++) {
			if(!strs[i].substring(0, len).equals(prefix)) return false;
		}
		return true;
	}
	
	private String findMinLen(String strs[]) {
		int min = strs[0].length();
		String minStr = strs[0];
		for(int i = 0; i < strs.length; i++) {
			if(strs[i].length() < min) {
				minStr = strs[i];
				min = strs[i].length();
			}
		}
		return minStr;
	}
}
