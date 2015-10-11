package Subtree;

public class Solution {
    /**
     * @param T1, T2: The roots of binary tree.
     * @return: True if T2 is a subtree of T1, or false.
     */
    public boolean isSubtree(TreeNode T1, TreeNode T2) {
        // write your code here
    	if(T2 == null) return true;
    	return subTree(T1, T2);
    }

	private boolean subTree(TreeNode t1, TreeNode t2) {
		// TODO Auto-generated method stub
		if(t1 == null) return false;
		if(t1.val == t2.val) {
			if(matchTree(t1, t2)) return true;
		}
		return subTree(t1.left, t2) || subTree(t1.right, t2);
	}

	private boolean matchTree(TreeNode t1, TreeNode t2) {
		// TODO Auto-generated method stub
		if(t1 == null) return t2 == null;
		if(t2 == null) return t1 == null;
		if(t1.val != t2.val) return false;
		return matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right);
		
	}
}