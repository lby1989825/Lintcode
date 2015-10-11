package InvertBinaryTree;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(3);
//		TreeNode c = new TreeNode(3);
		a.left = b;
		a.right = null;
//		b.left = null;
//		b.right = null;
//		TreeNode d = new TreeNode(4);
//		c.left = d;
//		c.right = null;
//		d.left = null;
//		d.right = null;
		Solution s = new Solution();
		s.invertBinaryTree(a);
	}

}
