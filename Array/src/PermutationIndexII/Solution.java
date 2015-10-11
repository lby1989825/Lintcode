package PermutationIndexII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /**
     * @param A an integer array
     * @return a long integer
     */
	private boolean[] marked;
	private List<Integer> temp;
	private int count = 0;
	private boolean find = false;
    public long permutationIndexII(int[] A) {
    	marked = new boolean[A.length];
    	int[] B = Arrays.copyOf(A, A.length);
    	Arrays.sort(B);
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	temp = new ArrayList<Integer>();
    	for(int i = 0; i < A.length; i++) temp.add(A[i]);
    	helper(B, marked, new ArrayList<Integer>(), res);
    	return count;
    }

	private void helper(int[] A, boolean[] marked, ArrayList<Integer> list, List<List<Integer>> res) {
		// TODO Auto-generated method stub
		if(!find && list.size() == A.length) {
			if(!find && !res.contains(list) && !res.contains(temp)) {
				res.add(new ArrayList<Integer>(list));
				count++;
			}
			else if(res.contains(temp)) find = true;
			return;
		}
		for(int i = 0; i < A.length && !find; i++) {
			if(!marked[i]) {
				marked[i] = true;
				list.add(A[i]);
				helper(A, marked, list, res);
				list.remove(list.size() - 1);
				marked[i] = false;
			}
		}
	}
}
