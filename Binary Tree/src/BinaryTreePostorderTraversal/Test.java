package BinaryTreePostorderTraversal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		a.left = b;
		a.right = c;
		b.left = null;
		b.right = null;
		c.left = null;
		c.right = null;
		Solution s = new Solution();
		s.postorderTraversal(a);
	}

}
