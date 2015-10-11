package NumberofIslandsII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    /**
     * @param n an integer
     * @param m an integer
     * @param operators an array of point
     * @return an integer array
     */
    public List<Integer> numIslands2(int n, int m, Point[] operators) {
        // Write your code here
    	List<Integer> res = new ArrayList<Integer>();
    	Set<List<Integer>> island = new HashSet<List<Integer>>();
    	Set<List<Integer>> neighbor = new HashSet<List<Integer>>();
    	for(int k = 0; k < operators.length; k++) {
    		List<Integer> point = new ArrayList<Integer>();
    		point.add(operators[k].x);
    		point.add(operators[k].y);
    		if(neighbor.contains(point) && !island.contains(point)) {
    			island.add(point);
    			addNeighbor(point, neighbor, island, n, m);
    		}
    		else if(neighbor.contains(point) && island.contains(point)) continue;
    		else if(!neighbor.contains(point) && island.contains(point)) continue;
    	}
    }

	private void addNeighbor(List<Integer> point, Set<List<Integer>> neighbor, Set<List<Integer>> island, int n, int m) {
		// TODO Auto-generated method stub
		int x = point.get(0), y = point.get(1);
		if(x - 1 > -1) {
			List<Integer> node = new ArrayList<Integer>();
			node.add(x - 1);
			node.add(y);
			if(!neighbor.contains(node) && !island.contains(node)) neighbor.add(node);
		}
		if(x + 1 < n) {
			List<Integer> node = new ArrayList<Integer>();
			node.add(x + 1);
			node.add(y);
			if(!neighbor.contains(node) && !island.contains(node)) neighbor.add(node);
		}
		if(y - 1 > -1) {
			List<Integer> node = new ArrayList<Integer>();
			node.add(x);
			node.add(y - 1);
			if(!neighbor.contains(node) && !island.contains(node)) neighbor.add(node);
		}
		if(y + 1 < m) {
			List<Integer> node = new ArrayList<Integer>();
			node.add(x);
			node.add(y - 1);
			if(!neighbor.contains(node) && !island.contains(node)) neighbor.add(node);
		}
		return;
	}
}
