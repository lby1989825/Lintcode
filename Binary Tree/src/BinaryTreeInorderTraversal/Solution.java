package BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root == null) return res;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(!stack.isEmpty() || root != null) {
			if(root != null) {
				stack.add(root);
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
