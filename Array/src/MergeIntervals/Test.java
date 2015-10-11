package MergeIntervals;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval(2, 3));
		intervals.add(new Interval(4, 5));
		intervals.add(new Interval(6, 7));
		intervals.add(new Interval(8, 9));
		intervals.add(new Interval(1, 10));
//		intervals.add(new Interval(5, 6));
//		intervals.add(new Interval(5, 6));
//		intervals.add(new Interval(4, 6));
//		intervals.add(new Interval(0, 0));
//		intervals.add(new Interval(1, 2));
//		intervals.add(new Interval(0, 2));
//		intervals.add(new Interval(4, 5));
		Solution s = new Solution();
		s.merge(intervals);
		System.out.println(1);
	}

}
