package BinaryTreeMaximumPathSum;

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
	private int sum;
    public int maxPathSum(TreeNode root) {
        // write your code here
    	if(root == null) return 0;
    	int res = findSum(root.left) + findSum(root.right) + root.val;
    	return Math.max(Math.max(maxPathSum(root.left), maxPathSum(root.right)), res);
    }
	private int findSum(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null) return 0;
		int left = Math.max(findSum(root.left), 0);
		int right = Math.max(findSum(root.right), 0);
		sum = Math.max(left + right + root.val, sum);
		return Math.max(left, right) + root.val;
	}
}
