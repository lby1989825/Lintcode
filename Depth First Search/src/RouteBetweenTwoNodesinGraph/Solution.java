package RouteBetweenTwoNodesinGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Solution {
	   /**
	     * @param graph: A list of Directed graph node
	     * @param s: the starting Directed graph node
	     * @param t: the terminal Directed graph node
	     * @return: a boolean value
	     */
	private boolean route = false;
    public boolean hasRoute(ArrayList<DirectedGraphNode> graph, DirectedGraphNode s, DirectedGraphNode t) {
	        // write your code here
	    	Map<DirectedGraphNode, Boolean> map = new HashMap<DirectedGraphNode, Boolean>();
	    	for(DirectedGraphNode g: graph) {
	    		map.put(g, false);
	    	}
	    	dfs(s, t, map);
	    	return route;
	    }

	private void dfs(DirectedGraphNode s, DirectedGraphNode t, Map<DirectedGraphNode, Boolean> map) {
		// TODO Auto-generated method stub
		map.put(s, true);
		if(s == t) {
			route = true;
			return;
		}
		for(DirectedGraphNode graph: s.neighbors) {
			if(!map.get(graph)) dfs(graph, t, map);
		}
		return;
		
	}
}
