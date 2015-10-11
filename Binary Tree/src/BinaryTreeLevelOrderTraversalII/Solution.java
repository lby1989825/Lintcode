package BinaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: buttom-up level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        // write your code here
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	if(root == null) return res;
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.add(root);
    	while(!queue.isEmpty()) {
    		ArrayList<TreeNode> nodeList = new ArrayList<TreeNode>();
    		ArrayList<Integer> valList = new ArrayList<Integer>();
    		while(!queue.isEmpty()) {
    			TreeNode t = queue.poll();
    			nodeList.add(t);
    			valList.add(t.val);
    		}
    		res.add(valList);
    		for(int i = 0; i < nodeList.size(); i++) {
    			TreeNode t = nodeList.get(i);
    			if(t.left != null) queue.add(t.left);
    			if(t.right != null) queue.add(t.right);
    		}
    	}
		reverse(res);
		return res;
    }

	private void reverse(ArrayList<ArrayList<Integer>> res) {
		// TODO Auto-generated method stub
		int i = 0, j = res.size() - 1;
		while(i < j) {
			ArrayList<Integer> temp = new ArrayList<Integer>(res.get(i));
			res.set(i, res.get(j));
			res.set(j, temp);
			i++;
			j--;
		}
	}
}
