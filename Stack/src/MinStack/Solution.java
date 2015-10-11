package MinStack;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private List<Integer> stack;
	private List<Integer> minStack;
    
    public Solution() {
        // do initialize if necessary
    	stack = new ArrayList<Integer>();
    	minStack = new ArrayList<Integer>();
    }

    public void push(int number) {
        // write your code here
    	stack.add(number);
    	if(minStack.size() == 0 || number <= minStack.get(minStack.size() - 1)) {
    		minStack.add(number);
    	}
    }

    public int pop() {
        // write your code here
    	int res = stack.get(stack.size() - 1);
    	stack.remove(stack.size() - 1);
    	if(res == minStack.get(minStack.size() - 1)) {
    		minStack.remove(minStack.size() - 1);
    	}
    	return res;
    }

    public int min() {
        // write your code here
    	return minStack.get(minStack.size() - 1);
    }
}
