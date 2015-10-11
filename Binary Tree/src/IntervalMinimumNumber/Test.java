package IntervalMinimumNumber;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		ArrayList<Interval> queries = new ArrayList<Interval>();
		queries.add(new Interval(1, 2));
		queries.add(new Interval(0, 4));
		queries.add(new Interval(2, 4));
		s.intervalMinNumber(new int[]{1,2,7,8,5}, queries);
	}

}
