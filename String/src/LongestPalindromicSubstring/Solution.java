package LongestPalindromicSubstring;

public class Solution {
    /**"abcdzdcab", return "cdzdc"
     * @param s input string
     * @return the longest palindromic substring
     */
    public String longestPalindrome(String s) {
        // Write your code here
    	String maxStr = "";
    	for(int i = 0; i < s.length(); i++) {
    		String s1 = s.substring(i, i + 1), s2 = "";
    		if(i < s.length() - 1) s2 = s.substring(i, i + 2);
    		String tmp1 = helper(s, i, i);
    		String tmp2 = helper(s, i, i + 1);
    		if(tmp1.length() > tmp2.length() && tmp1.length() > maxStr.length()) {
    			maxStr = tmp1;
    		}
    		else if(tmp1.length() < tmp2.length() && tmp2.length() > maxStr.length()) {
    			maxStr = tmp2;
    		}
    	}
    	return maxStr;
    	
    }

	private String helper(String s, int L, int R) {
		// TODO Auto-generated method stub
		int i = L, j = R;
		while(i > -1 && j < s.length() && s.charAt(i) == s.charAt(j)) {
			i--;
			j++;
		}
		return s.substring(i + 1, j);
	}
}
