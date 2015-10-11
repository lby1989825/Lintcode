package CloneGraph;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * @param node: A undirected graph node
     * @return: A undirected graph node
     */
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        // write your code here
    	if(node == null) return null;
        Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        return dfs(node, map);
    }

	private UndirectedGraphNode dfs(UndirectedGraphNode node, Map<UndirectedGraphNode, UndirectedGraphNode> map) {
		// TODO Auto-generated method stub
		if(map.containsKey(node)) return map.get(node);
		UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
		map.put(node, clone);
		for(int i = 0; i < node.neighbors.size(); i++) {
			clone.neighbors.add(dfs(node.neighbors.get(i), map));
		}
		return clone;
	}
}
