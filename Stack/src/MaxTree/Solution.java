package MaxTree;

public class Solution {
    /**
     * @param A: Given an integer array with no duplicates.
     * @return: The root of max tree.
     */
	private int[] left, right, num;
    public TreeNode maxTree(int[] A) {
        // write your code here
    	num = A;
    	left = new int[A.length];
    	right = new int[A.length];
    	int max1 = A[0], max2 = A[A.length - 1];
    	left[0] = 0;
    	for(int i = 1; i < left.length; i++) {
    		if(A[i] > max1) {
    			max1 = A[i];
    			left[i] = i;
    		}
    		else left[i] = left[i - 1];
    	}
    	right[right.length - 1] = A.length - 1;
    	for(int i = A.length - 2; i > -1; i--) {
    		if(A[i] > max2) {
    			max2 = A[i];
    			right[i] = i;
    		}
    		else right[i] = right[i + 1];
    	}
    	return maxTree(0, A.length - 1, true);
    }

	private TreeNode maxTree(int start, int end, boolean direction) {
		// TODO Auto-generated method stub
		if(start > end) return null;
		if(start == end) return new TreeNode(num[start]);
		int maxIndex;
		if(direction) maxIndex = left[end];
		else maxIndex = right[start];
		TreeNode root = new TreeNode(num[maxIndex]);
		root.left = maxTree(start, maxIndex - 1, true);
		root.right = maxTree(maxIndex + 1, end, false);
		return root;
		
	}
}
