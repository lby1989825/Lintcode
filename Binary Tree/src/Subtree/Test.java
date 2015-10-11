package Subtree;

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
		TreeNode d = new TreeNode(4);
		c.left = d;
		c.right = null;
		d.left = null;
		d.right = null;
		Solution s = new Solution();
		TreeNode A = new TreeNode(3);
		TreeNode B = new TreeNode(4);
		A.left = B;
		A.right = null;
		B.left = null;
		B.right = null;
		boolean boo = s.isSubtree(a, A);
		System.out.println(boo);
	}

}
