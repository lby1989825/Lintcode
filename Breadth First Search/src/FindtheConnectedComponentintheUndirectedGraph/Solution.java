package FindtheConnectedComponentintheUndirectedGraph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    /**
     * @param nodes a array of Undirected graph node
     * @return a connected set of a Undirected graph
     */
    Map<UndirectedGraphNode, Boolean> map = new HashMap<UndirectedGraphNode, Boolean>();
    public List<List<Integer>> connectedSet(ArrayList<UndirectedGraphNode> nodes) {
        // Write your code here
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nodes.size() == 0) return res;
        for(int i = 0; i < nodes.size(); i++) map.put(nodes.get(i), false);
        for(int i = 0; i < nodes.size(); i++) {
            UndirectedGraphNode g = nodes.get(i);
            if(map.get(g) == false) {
            	List<Integer> list = new ArrayList<Integer>();
                dfs(g, map, list);
                Collections.sort(list, new ListComparator());
                res.add(list);
            }
        }
        return res;
    }
    

	private void dfs(UndirectedGraphNode node, Map<UndirectedGraphNode, Boolean> map, List<Integer> list) {
        list.add(node.label);
        map.put(node, true);
        ArrayList<UndirectedGraphNode> neighbors = node.neighbors;
        for(int i = 0; i < neighbors.size(); i++) {
            UndirectedGraphNode g = neighbors.get(i);
            if(map.get(g) == false) dfs(g, map, list);
        }
    }
}

