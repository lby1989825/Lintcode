package InterleavingString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Solution {
    /**
     * Determine whether s3 is formed by interleaving of s1 and s2.
     * @param s1, s2, s3: As description.
     * @return: true or false.
     */
	private boolean b = false;
    public boolean isInterleave(String s1, String s2, String s3) {
        // write your code here
    	if(s3.length() != s1.length() + s2.length()) return false;
    	if(s1.length() == 0) return s2.equals(s3);
    	if(s2.length() == 0) return s1.endsWith(s3);
    	List<List<String>> res = new ArrayList<List<String>>();
    	List<String> list = new ArrayList<String>();
    	list.add(s1);
    	list.add(s2);
    	list.add(s3);
    	res.add(list);
    	for(int i = 0; i < s3.length(); i++) {
    		res = helper(res);
    		if(b) return true;
    		if(res.size() == 0) return false;
    	}
    	return true;
    }
    
    public List<List<String>> helper(List<List<String>> res) {
    	int sz = res.size();
    	for(int i = 0; i < sz; i++) {
    		List<String> list = res.get(i);
    		String s1 = list.get(0), s2 = list.get(1), s3 = list.get(2);
    		if(s1.length() == 0 && !s2.equals(s3)) continue;
    		else if(s2.length() == 0 && !s1.equals(s3)) continue;
    		else if(s1.length() == 0 && s2.equals(s3)) {
    			b = true;
    			break;
    		}
    		else if(s2.length() == 0 && s1.equals(s3)) {
    			b = true;
    			break;
    		}
    		if(s1.charAt(0) == s3.charAt(0) && s2.charAt(0) != s3.charAt(0)) {
    			List<String> temp = new ArrayList<String>();
    			temp.add(s1.substring(1));
    			temp.add(s2);
    			temp.add(s3.substring(1));
    			res.add(temp);
    		}
    		else if(s1.charAt(0) != s3.charAt(0) && s2.charAt(0) == s3.charAt(0)) {
    			List<String> temp = new ArrayList<String>();
    			temp.add(s1);
    			temp.add(s2.substring(1));
    			temp.add(s3.substring(1));
    			res.add(temp);
    		}
    		else if(s1.charAt(0) == s3.charAt(0) && s2.charAt(0) == s3.charAt(0)) {
    			List<String> temp1 = new ArrayList<String>();
    			temp1.add(s1.substring(1));
    			temp1.add(s2);
    			temp1.add(s3.substring(1));
    			List<String> temp2 = new ArrayList<String>();
    			temp2.add(s1);
    			temp2.add(s2.substring(1));
    			temp2.add(s3.substring(1));
    			res.add(temp1);
    			res.add(temp2);
    		}
    	}
    	for(int i = 0; i < sz; i++) res.remove(0);
    	return removeDuplicate(res);
    }

	private List<List<String>> removeDuplicate(List<List<String>> temp) {
		// TODO Auto-generated method stub
		List<List<String>> res = new ArrayList<List<String>>();
		Set<List<String>> set = new HashSet<List<String>>();
		for(int i = 0; i < temp.size(); i++) {
			if(!set.contains(temp.get(i))) {
				res.add(temp.get(i));
				set.add(temp.get(i));
			}
			else continue;
		}
		return res;
	}

}
