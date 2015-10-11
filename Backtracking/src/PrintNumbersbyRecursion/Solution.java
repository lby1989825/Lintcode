package PrintNumbersbyRecursion;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * @param n: An integer.
     * return : An array storing 1 to the largest number with n digits.
     */
    public List<Integer> numbersByRecursion(int n) {
        // write your code here
        if(n == 0) return new ArrayList<Integer>();
    	if(n == 1) {
    		List<Integer> list = new ArrayList<Integer>();
    		for(int i = 1; i < 10; i++) {
    			list.add(i);
    		}
    		return list;
    	}
    	List<Integer> list = numbersByRecursion(n - 1);
    	List<Integer> res = new ArrayList<Integer>();
    	for(int i = 0; i < 10; i++) {
    		res.addAll(getList(list, i, n));
    		if(i + 1 < 10) res.add((list.get(list.size() - 1) + 1) * (i + 1));
    	}
    	return res;
    }

	private List<Integer> getList(List<Integer> list, int k, int n) {
		// TODO Auto-generated method stub
		List<Integer> res = new ArrayList<Integer>();
		if(k == 0) return list;
		for(int i = 0; i < list.size(); i++) {
			int tmp = (int) (list.get(i) + Math.pow(10, n - 1) * k);
			res.add(tmp);
		}
		return res;
	}
}
