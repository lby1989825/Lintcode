package DeleteDigits;

import java.util.Stack;

public class Solution {
    /** 178542->17542->1542->142->12
     *@param A: A positive integer which has N digits, A is a string.
     *@param k: Remove k digits.
     *@return: A string
     */
    public String DeleteDigits(String A, int k) {
    	int count = 0;
    	StringBuilder sb = new StringBuilder();
    	Stack<Integer> stack = new Stack<Integer>();
    	int[] arr = new int[A.length()];
    	for(int i = 0; i < A.length(); i++) {
    		arr[i] = Integer.parseInt(A.substring(i, i + 1));
    	}
    	stack.push(arr[0]);
    	for(int i = 1; i < arr.length; i++) {
    		while(count != k && !stack.isEmpty() && stack.peek() > arr[i]) {
    			stack.pop();
    			count++;
    		}
    		stack.push(arr[i]);
    	}
    	while(count < k) {
    		stack.pop();
    		count++;
    	}
    	while(!stack.isEmpty()) sb.append(stack.pop());
    	return getString(sb.reverse().toString());
    }

	private String getString(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		int flag = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '0' && flag == 0) continue;
			else {
				sb.append(s.charAt(i));
				flag = 1;
			}
		}
		return sb.toString();
	}
}