package IntervalMinimumNumber;

import java.util.ArrayList;

public class Solution {
    /**
     *@param A, queries: Given an integer array and an query list
     *@return: The result list
     */
    public ArrayList<Integer> intervalMinNumber(int[] A, ArrayList<Interval> queries) {
        // write your code here
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	MinTreeNode root = buildTree(A, 0, A.length - 1);
    	for(Interval queriey: queries) {
    		res.add(getVal(root, queriey.start, queriey.end));
    	}
    	return res;
    }

	private int getVal(MinTreeNode root, int from, int to) {
		// TODO Auto-generated method stub
		if(root == null || root.start > to || root.end < from) return Integer.MAX_VALUE;
		if(root.start == root.end || (root.start >= from && root.end <= to)) return root.min;
		return Math.min(getVal(root.left, from, to), getVal(root.right, from, to));
	}

	private MinTreeNode buildTree(int[] A, int from, int to) {
		// TODO Auto-generated method stub
		if(from > to) return null;
		if(from == to) return new MinTreeNode(from, from, A[from]);
		MinTreeNode root = new MinTreeNode(from, to);
		root.left = buildTree(A, from, (from + to) / 2);
		root.right = buildTree(A, (from + to) / 2 + 1, to);
		if(root.left == null) root.min = root.right.min;
		else if(root.right == null) root.min = root.left.min;
		else root.min = Math.max(root.left.min, root.right.min);
		return root;
	}
}