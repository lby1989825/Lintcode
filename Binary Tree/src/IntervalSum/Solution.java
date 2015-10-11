package IntervalSum;

import java.util.ArrayList;

public class Solution {
    /**
     *@param A, queries: Given an integer array and an query list
     *@return: The result list
     */
    public ArrayList<Long> intervalSum(int[] A, ArrayList<Interval> queries) {
        // write your code here
    	ArrayList<Long> res = new ArrayList<Long>();
    	SumTreeNode root = buildTree(A, 0, A.length - 1);
    	for(int i = 0; i < queries.size(); i++) {
    		Interval inter = queries.get(i);
    		res.add(getSum(root, inter.start, inter.end));
    	}
    	return res;
    }


	private Long getSum(SumTreeNode root, int from, int to) {
		// TODO Auto-generated method stub
		if (root == null || root.end < from || root.start > to) {
            return (long) 0;
        }        
        if (root.start == root.end || (from <= root.start && to >= root.end)) {
            return (long) root.sum;
        }
        return getSum(root.left, from, to) + getSum(root.right, from, to);
	}


	private SumTreeNode buildTree(int[] A, int from, int to) {
		// TODO Auto-generated method stub
		if(from > to) return null;
		if(from == to) return new SumTreeNode(from, from, A[from]);
		SumTreeNode root = new SumTreeNode(from, to);
		root.left = buildTree(A, from, (from + to) / 2);
		root.right = buildTree(A, (from + to) / 2 + 1, to);
		if(root.left == null) root.sum = root.right.sum;
		else if(root.right == null) root.sum = root.left.sum;
		else root.sum = root.left.sum + root.right.sum;
		return root;
	}
}
