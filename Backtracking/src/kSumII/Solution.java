package kSumII;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    /**
     * @param A: an integer array.
     * @param k: a positive integer (k <= length(A))
     * @param target: a integer
     * @return a list of lists of integer 
     */ 
    public ArrayList<ArrayList<Integer>> kSumII(int A[], int k, int target) {
        // write your code here
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	helper(A, 0, k, target, list, res);
    	return res;
    }

	private void helper(int[] A, int start, int k, int target,
			ArrayList<Integer> list, ArrayList<ArrayList<Integer>> res) {
		// TODO Auto-generated method stub
		if(k < 0 || target < 0) return;
		if(k == 0 && target == 0) {
			res.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i = start; i < A.length; i++) {
			list.add(A[i]);
			helper(Arrays.copyOfRange(A, 1, A.length), i, k - 1, target - A[i], list, res);
			list.remove(list.size() - 1);
		}
	}
}
