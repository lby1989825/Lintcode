package InsertNodeinaBinarySearchTree;

import java.util.Stack;

public class Solution {
    /**
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if(root == null) return node;
    	TreeNode p = root;
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	stack.push(p);
    	while(p != null) {
    		if(p.val < node.val) p = p.right;
    		else if(p.val > node.val) p = p.left;
    		else return root;
    		if(p != null) stack.push(p);
    	}
    	TreeNode t = stack.pop();
    	if(t.val < node.val) t.right = node;
    	else t.left = node;
    	return root;
    }
}
