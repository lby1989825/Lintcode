package SegmentTreeQuery;


public class Solution {
    /**
     *@param root, start, end: The root of segment tree and 
     *                         an segment / interval
     *@return: The maximum number in the interval [start, end]
     */
    public int query(SegmentTreeNode root, int start, int end) {
        // write your code here
    	if(root == null) return Integer.MIN_VALUE;
        if(root.end < start || root.start > end || start > end) return Integer.MIN_VALUE;
        if(root.start >= start && root.end <= end) return root.max;
        int mid = root.start + (root.end - root.start) / 2;
        int leftMax = query(root.left, start, Math.min(mid, end));
        int rightMax = query(root.right, Math.max(mid, start), end);
        return Math.max(leftMax, rightMax);
    }
}