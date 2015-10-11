package BinaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Postorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;
        TreeNode pre = null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode cur = stack.peek();
            if(pre == null || pre.left == cur || pre.right == cur) {
                if(cur.left != null) stack.push(cur.left);
                else if(cur.right != null) stack.push(cur.right);
                else res.add(stack.pop().val);
            }
            else if(cur.left == pre) {
                if(cur.right != null) stack.push(cur.right);
                else res.add(stack.pop().val);
            }
            else res.add(stack.pop().val);
            pre = cur;
        }
        return res;
    }
}


