package kSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /**
     * @param A: an integer array.
     * @param k: a positive integer (k <= length(A))
     * @param target: a integer
     * @return an integer
     */
    public int kSum(int A[], int k, int target) {
        // write your code here
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if(A.length == 0 || A == null || k == 0) return 0;
    	Arrays.sort(A);
    	helper(A, 0, k, target, new ArrayList<Integer>(), res);
    	return res.size();
    }

	private void helper(int[] A, int start, int k, int target, List<Integer> list, List<List<Integer>> res) {
		if(target < 0 || k < 0) return;
		if(target == 0 && k == 0) {
			if(!res.contains(list)) res.add(new ArrayList<Integer>(list));
			return ;
		}
		for(int i = start; i < A.length; i++) {
			list.add(A[i]);
			helper(Arrays.copyOfRange(A, 1, A.length), i, k - 1, target - A[i], list, res);
			list.remove(list.size() - 1);
		}
	}
}
