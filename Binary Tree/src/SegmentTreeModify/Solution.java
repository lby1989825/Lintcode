package SegmentTreeModify;

import java.util.Stack;

public class Solution {
    /**
     *@param root, index, value: The root of segment tree and 
     *@ change the node's value with [index, index] to the new given value
     *@return: void
     */
    public void modify(SegmentTreeNode root, int index, int value) {
        // write your code here
    	boolean change = false;
    	Stack<SegmentTreeNode> stack = new Stack<SegmentTreeNode>();
    	stack.push(root);
    	while(!stack.isEmpty()) {
    		SegmentTreeNode t = stack.peek();
    		double mid = (double) (t.start + t.end) / 2;
    		if(mid < index) {
    			stack.push(t.right);
    		}
    		else if(mid >= index && (t.start != t.end)) {
    			stack.push(t.left);
    		}
    		else if(t.start == index && t.end == index){
    			while(!stack.isEmpty()) {
    				SegmentTreeNode res = stack.pop();
    				if(!change) {
    					res.max = value;
        				change = true;
    				}
    				if(stack.isEmpty()) break;
        			SegmentTreeNode parent = stack.peek();
        			SegmentTreeNode bro = null;
        			if(parent.left == res) bro = parent.right;
        			else bro = parent.left;
        			parent.max = Math.max(res.max, bro.max);
    			}
    		}
    	}
    }
}
