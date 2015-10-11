package FindtheWeakConnectedComponentintheDirectedGraph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Definition for Directed graph.
 * class DirectedGraphNode {
 *     int label;
 *     ArrayList<DirectedGraphNode> neighbors;
 *     DirectedGraphNode(int x) { label = x; neighbors = new ArrayList<DirectedGraphNode>(); }
 * };
 */
public class Solution {
    /**
     * @param nodes a array of Directed graph node
     * @return a connected set of a directed graph
     */
    public List<List<Integer>> connectedSet2(ArrayList<DirectedGraphNode> nodes) {
        // Write your code here
    	int count = 1;
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	Map<DirectedGraphNode, Integer> map = new HashMap<DirectedGraphNode, Integer>();
    	for(int i = 0; i < nodes.size(); i++) map.put(nodes.get(i), 0);
    	for(int i = 0; i < nodes.size(); i++) {
    		DirectedGraphNode node = nodes.get(i);
    		if(map.get(node) != 0) getNeighborMap(node, map.get(node), map);
    		else {
    			getNeighborMap(node, count, map);
        		count++;
    		}
    	}
    	for(DirectedGraphNode key: map.keySet()) {
    		List<Integer> list = new ArrayList<Integer>();
    		for(int j = 0; j < nodes.size(); j++) {
    			if(map.get(nodes.get(j)) == map.get(key)) list.add(nodes.get(j).label);
    		}
    		Collections.sort(list);
    		if(!res.contains(list) && list.size() != 0) res.add(list);
    	}
		return res;
    }
	private void getNeighborMap(DirectedGraphNode node, int count, Map<DirectedGraphNode, Integer> map) {
		// TODO Auto-generated method stub
		map.put(node, count);
		for(int i = 0; i < node.neighbors.size(); i++) {
			DirectedGraphNode neighbor = node.neighbors.get(i);
			if(map.get(neighbor) == 0) map.put(neighbor, count);
			else changeMap(map.get(neighbor), count, map);
		}
		
	}
	private void changeMap(int num, int res, Map<DirectedGraphNode, Integer> map) {
		// TODO Auto-generated method stub
		Set<DirectedGraphNode> keySet = map.keySet();
		for(DirectedGraphNode key : keySet) {
			if(map.get(key) == num) map.put(key, res);
		}
	}
}
