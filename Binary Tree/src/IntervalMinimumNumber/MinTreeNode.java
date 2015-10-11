package IntervalMinimumNumber;

class MinTreeNode {
	int start, end, min;
	MinTreeNode left, right;
	MinTreeNode(int start, int end) {
		this.start = start;
		this.end = end;
	}
	MinTreeNode(int start, int end, int min) {
		this(start, end);
		this.min = min;
	}
}
