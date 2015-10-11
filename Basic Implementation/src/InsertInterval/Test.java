package InsertInterval;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval(1, 5));
		s.insert(intervals, new Interval(5, 7));
	}

}
