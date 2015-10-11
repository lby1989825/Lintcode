package SegmentTreeModify;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SegmentTreeNode a = new SegmentTreeNode(0, 6, 10);
		SegmentTreeNode b = new SegmentTreeNode(0, 3, 10);
		SegmentTreeNode c = new SegmentTreeNode(4, 6, 9);
		SegmentTreeNode d = new SegmentTreeNode(0, 1, 10);
		SegmentTreeNode e = new SegmentTreeNode(2, 3, 5);
		SegmentTreeNode f = new SegmentTreeNode(4, 5, 9);
		SegmentTreeNode g = new SegmentTreeNode(6, 6, 3);
		SegmentTreeNode h = new SegmentTreeNode(0, 0, 10);
		SegmentTreeNode i = new SegmentTreeNode(1, 1, 1);
		SegmentTreeNode j = new SegmentTreeNode(2, 2, 2);
		SegmentTreeNode k = new SegmentTreeNode(3, 3, 5);
		SegmentTreeNode l = new SegmentTreeNode(4, 4, 1);
		SegmentTreeNode m = new SegmentTreeNode(5, 5, 9);		
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;
		d.left = h;
		d.right = i;
		e.left = j;
		e.right = k;
		f.left = l;
		f.right = m;
		Solution s = new Solution();
		s.modify(a, 3, 3);
	}

}
