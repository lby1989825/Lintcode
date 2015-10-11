package FindtheWeakConnectedComponentintheDirectedGraph;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirectedGraphNode A = new DirectedGraphNode(1);
		DirectedGraphNode B = new DirectedGraphNode(2);
		DirectedGraphNode C = new DirectedGraphNode(3);
		DirectedGraphNode D = new DirectedGraphNode(4);
		DirectedGraphNode E = new DirectedGraphNode(5);
		DirectedGraphNode F = new DirectedGraphNode(6);
		DirectedGraphNode G = new DirectedGraphNode(7);
		A.neighbors.add(B);
		A.neighbors.add(C);
		A.neighbors.add(D);
		B.neighbors.add(C);
		B.neighbors.add(D);
		C.neighbors.add(D);
		E.neighbors.add(F);
		G.neighbors.add(E);
		G.neighbors.add(C);
		Solution s = new Solution();
		ArrayList<DirectedGraphNode> nodes = new ArrayList<DirectedGraphNode>();
		nodes.add(A);
		nodes.add(B);
		nodes.add(C);
		nodes.add(D);
		nodes.add(E);
		nodes.add(F);
		nodes.add(G);
		List<List<Integer>> res = s.connectedSet2(nodes);
		System.out.println(res);
	}

}
