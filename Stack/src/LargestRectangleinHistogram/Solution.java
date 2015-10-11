package LargestRectangleinHistogram;

import java.util.Arrays;
import java.util.Stack;


public class Solution {
    /**
     * @param height: A list of integer
     * @return: The area of largest rectangle in the histogram
     */
    public int largestRectangleArea(int[] height) {
        // write your code here
    	int maxArea = 0, i = 0, N = height.length;
    	int[] h = new int[N + 1];
    	h = Arrays.copyOf(height, N + 1);
    	Stack<Integer> stack = new Stack<Integer>();
    	while(i < h.length) {
    		if(stack.isEmpty() || h[stack.peek()] <= h[i]) stack.push(i++);
    		else {
    			int top = stack.pop();
    			if(stack.isEmpty()) maxArea = Math.max(maxArea, h[top] * i);
    			else maxArea = Math.max(maxArea, h[top] * (i - stack.peek() - 1));
    		}
    	}
    	return maxArea;
    }
}
