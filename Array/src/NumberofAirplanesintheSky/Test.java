package NumberofAirplanesintheSky;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Interval> airplanes = new ArrayList<Interval>();
		Interval a = new Interval(1, 10);
		Interval b = new Interval(2, 3);
		Interval c = new Interval(5, 8);
		Interval d = new Interval(4, 7);
		airplanes.add(a);
		airplanes.add(b);
		airplanes.add(c);
		airplanes.add(d);
		Solution s = new Solution();
		s.countOfAirplanes(airplanes);
		
	}

}
