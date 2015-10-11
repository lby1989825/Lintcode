package SearchRangeinBinarySearchTree;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    /**
     * @param root: The root of the binary search tree.
     * @param k1 and k2: range k1 to k2.
     * @return: Return all keys that k1<=key<=k2 in ascending order.
     */
    public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        // write your code here
    	ArrayList<Integer> tmp = inorderTraversal(root);
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	for(int i = 0; i < tmp.size(); i++) {
    		if(tmp.get(i) >= k1 && tmp.get(i) <= k2) res.add(tmp.get(i));
    	}
    	return res;
    }

	private ArrayList<Integer> inorderTraversal(TreeNode root) {
		// TODO Auto-generated method stub
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(!stack.isEmpty() || root != null) {
			if(root != null) {
				stack.push(root);
				root = root.left;
			}
			else {
				TreeNode t = stack.pop();
				res.add(t.val);
				root = t.right;
			}
		}
		return res;
	}
}
