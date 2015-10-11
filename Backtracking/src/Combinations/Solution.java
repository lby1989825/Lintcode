package Combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /**
     * @param n: Given the range of numbers
     * @param k: Given the numbers of combinations
     * @return: All the combinations of k numbers out of 1..n
     */
    public List<List<Integer>> combine(int n, int k) {
		// write your code here
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	int[] num = new int[n];
    	for(int i = 0; i < n; i++) num[i] = i + 1;
    	helper(num, 0, k, new ArrayList<Integer>(), res);
    	return res;
    }

	private void helper(int[] num, int start, int k, ArrayList<Integer> list,
			List<List<Integer>> res) {
		// TODO Auto-generated method stub
		if(k < 0) return;
		if(k == 0) {
			res.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i = start; i < num.length; i++) {
			list.add(num[i]);
			helper(Arrays.copyOfRange(num, 1, num.length), i, k - 1, list, res);
			list.remove(list.size() - 1);
		}
	}
}
