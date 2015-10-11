package FindtheConnectedComponentintheUndirectedGraph;

import java.util.Comparator;

class ListComparator implements Comparator<Integer> {

	public int compare(Integer i, Integer j) {
		// TODO Auto-generated method stub
		if(i > j) return 1;
		else if(i == j) return 0;
		else return -1;
	}
	
}
