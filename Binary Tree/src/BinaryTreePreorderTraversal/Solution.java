package BinaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode t = stack.pop();
            res.add(t.val);
            if(t.right != null) stack.push(t.right);
            if(t.left != null) stack.push(t.left);
        }
        return res;
    }
}


