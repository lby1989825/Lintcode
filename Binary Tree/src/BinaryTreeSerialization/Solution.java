package BinaryTreeSerialization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Solution {
    /**
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
    	if(root == null) return "{}";
    	int count = 0;
    	StringBuilder sb = new StringBuilder();
    	sb.append("{");
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.add(root);
    	while(!queue.isEmpty() && count < getHeight(root)) {
    		List<TreeNode> list = new ArrayList<TreeNode>();
    		while(!queue.isEmpty()) {
    			TreeNode t = queue.poll();
    			if(t == null) {
    				sb.append("#");
    				sb.append(",");
    			}
    			else {
    				sb.append(t.val);
        			sb.append(",");
        			list.add(t);
    			}
    		}
    		count++;
    		for(int i = 0; i < list.size(); i++) {
    			TreeNode t = list.get(i);
    			if(t.left != null) queue.add(t.left);
    			else if(t.left == null) queue.add(null);
    			if(t.right != null) queue.add(t.right);
    			else if(t.right == null) queue.add(null);
    		}
    	}
    	sb.setCharAt(sb.length() - 1, '}');
    	return sb.toString();
    }
    
    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
    	if(data.equals("{}")) return null;
    	String[] str = data.substring(1, data.length() - 1).split(",");
    	Map<Integer, TreeNode> map = new HashMap<Integer, TreeNode>();
    	for(int i = 0; i < str.length; i++) {
    		if(!str[i].equals("#")) {
    			map.put(i, new TreeNode(Integer.valueOf(str[i])));
    		}
    		else map.put(i, null);
    	}
    	int i = 0, j = 0;
    	while(i < str.length && j < str.length) {
    		TreeNode parent = map.get(i), left, right;
    		if(parent == null) i++;
    		else {
    			left = j + 1 < str.length ? map.get(j + 1) : null;
    			right = j + 2 < str.length ? map.get(j + 2) : null;
    			parent.left = left;
        		parent.right = right;
    			j += 2;
    			i++;
    		}
    	}
		return map.get(0);
    }
    
    private int getHeight(TreeNode root) {
    	if(root == null) return 0;
    	return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}