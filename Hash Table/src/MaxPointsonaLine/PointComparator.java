package MaxPointsonaLine;

import java.util.Comparator;

class PointComparator implements Comparator<Point>{

	@Override
	public int compare(Point p1, Point p2) {
		// TODO Auto-generated method stub
		if(p1.x < p2.x) return -1;
		else if(p1.x > p2.x) return 1;
		else {
			if(p1.y < p2.y) return -1;
			else if(p1.y > p2.y) return 1;
			else return 0;
		}
	}

}
