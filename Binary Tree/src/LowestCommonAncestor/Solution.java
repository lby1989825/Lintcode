package LowestCommonAncestor;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * @param root: The root of the binary search tree.
     * @param A and B: two nodes in a Binary.
     * @return: Return the least common ancestor(LCA) of the two nodes.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        // write your code here
    	List<TreeNode> res1 = new ArrayList<TreeNode>();
    	List<TreeNode> res2 = new ArrayList<TreeNode>();
    	List<TreeNode> list1 = new ArrayList<TreeNode>();
    	List<TreeNode> list2 = new ArrayList<TreeNode>();
    	dfs(root, A, list1, res1);
    	dfs(root, B, list2, res2);
    	int i = 0;
    	for(i = 0; i < Math.min(res1.size(), res2.size()); i++) {
    		if(res1.get(i) != res2.get(i)) break;
    	}
    	if(i == Math.min(res1.size(), res2.size())) {
    		if(res1.size() >= res2.size()) return res1.get(i - 1);
    		else return res2.get(i - 1);
    	}
    	return res1.get(i - 1);
    }
    
    private void dfs(TreeNode root, TreeNode A, List<TreeNode> list, List<TreeNode> res) {
    	if(root == null) return;
    	list.add(root);
    	if(root == A) {
    		res.addAll(new ArrayList<TreeNode>(list));
    		return;
    	}
    	if(root.left != null) dfs(root.left, A, list, res);
    	if(root.right != null) dfs(root.right, A, list, res);
    	list.remove(list.size() - 1);
    }
}
