package KthSmallestNumberinSortedMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * @param matrix: a matrix of integers
     * @param k: an integer
     * @return: the kth smallest number in the matrix
     */
    public int kthSmallest(int[][] matrix, int k) {
        // write your code here
    	int m = matrix.length, n = matrix[0].length;
    	while(k > m + n - 1) k -= (m--) + (n--) - 1;
    	List<List<Integer>> list = getList(matrix, matrix.length - m, matrix[0].length - n);
    	List<Integer> res = merge(list.get(0), list.get(1));
    	return res.get(k - 1);
    }

	private List<Integer> merge(List<Integer> l1, List<Integer> l2) {
		// TODO Auto-generated method stub
		List<Integer> res = new ArrayList<Integer>();
		int i = 0, j = 0;
		while(i < l1.size() && j < l2.size()) {
			if(l1.get(i) <= l2.get(j)) res.add(l1.get(i++));
			else res.add(l2.get(j++));
		}
		if(i == l1.size()) res.addAll(l2.subList(j, l2.size()));
		else res.addAll(l1.subList(i, l1.size()));
		return res.subList(1, res.size());
	}

	private List<List<Integer>> getList(int[][] matrix, int m, int n) {
		// TODO Auto-generated method stub
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> rows = new ArrayList<Integer>();
		for(int j = n; j < matrix[m].length; j++) rows.add(matrix[m][j]);
		res.add(rows);
		List<Integer> cols = new ArrayList<Integer>();
		for(int i = m; i < matrix.length; i++) cols.add(matrix[i][n]);
		res.add(cols);
		return res;
	}
}
