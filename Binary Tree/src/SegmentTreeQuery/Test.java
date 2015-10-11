package SegmentTreeQuery;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SegmentTreeNode a = new SegmentTreeNode(0, 3, 4);
		SegmentTreeNode b = new SegmentTreeNode(0, 1, 4);
		SegmentTreeNode c = new SegmentTreeNode(2, 3, 3);
		SegmentTreeNode d = new SegmentTreeNode(0, 0, 1);
		SegmentTreeNode e = new SegmentTreeNode(1, 1, 4);
		SegmentTreeNode f = new SegmentTreeNode(2, 2, 2);
		SegmentTreeNode g = new SegmentTreeNode(3, 3, 3);
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;
		Solution s = new Solution();
		s.query(a, 1, 2);
		
	}

}
