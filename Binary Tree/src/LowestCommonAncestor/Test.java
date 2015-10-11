package LowestCommonAncestor;

public class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		TreeNode a = new TreeNode(4);
		TreeNode b = new TreeNode(3);
		TreeNode c = new TreeNode(7);
		TreeNode d = new TreeNode(5);
		TreeNode e = new TreeNode(6);
		a.left = b;
		a.right = c;
		b.left = null;
		b.right = null;
		c.left = d;
		c.right = e;
		d.left = null;
		d.right = null;
		d.left = null;
		d.right = null;
		s.lowestCommonAncestor(a, e, c);
		
	}

}
