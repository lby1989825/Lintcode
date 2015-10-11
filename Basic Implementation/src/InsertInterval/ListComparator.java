package InsertInterval;

import java.util.Comparator;

public class ListComparator implements Comparator<Interval>{

	@Override
	public int compare(Interval i1, Interval i2) {
		// TODO Auto-generated method stub
		if(i1.start < i2.start) return -1;
		else if(i1.start > i2.start) return 1;
		else {
			if(i1.end < i2.end) return -1;
			else if(i1.end > i2.end) return 1;
			else return 0;
		}
	}
	
}
