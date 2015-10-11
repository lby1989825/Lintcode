package IntervalSum;

class SumTreeNode {
	long start, end, sum;
	SumTreeNode left, right;
	SumTreeNode(long start, long end){
		this.start = start;
		this.end = end;
	}
	SumTreeNode(long start, long end, long sum) {
		this(start, end);
		this.sum = sum;
	}
}
