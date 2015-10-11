package TopologicalSorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * @param graph: A list of Directed graph node
     * @return: Any topological order for the given graph.
     */    
    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
        // write your code here
    	ArrayList<DirectedGraphNode> res = new ArrayList<DirectedGraphNode>();
    	Map<DirectedGraphNode, Integer> status = new HashMap<DirectedGraphNode, Integer>();
    	for(DirectedGraphNode node: graph) status.put(node, 0);
    	while(hasUnvisited(status, graph)) {
    		DirectedGraphNode node = null;
    		for(DirectedGraphNode temp: graph) {
    			node = temp;
    			search(status, graph, res, node);
    		}
    	}
    	return res;
    }

	private void search(Map<DirectedGraphNode, Integer> status, ArrayList<DirectedGraphNode> graph, ArrayList<DirectedGraphNode> res, DirectedGraphNode node) {
		// TODO Auto-generated method stub
		if(status.get(node) == 1) throw new IllegalArgumentException("Not DAG");
		if(status.get(node) == 2) return;
		status.put(node, 1);
		for(DirectedGraphNode next: node.neighbors) {
			search(status, graph, res, next);
		}
		status.put(node, 2);
		res.add(0, node);
	}

	private boolean hasUnvisited(Map<DirectedGraphNode, Integer> status, ArrayList<DirectedGraphNode> graph) {
		// TODO Auto-generated method stub
		for(DirectedGraphNode node: graph) {
			if(status.get(node) == 0) return true;
		}
		return false;
	}
}