package ValidParentheses;

import java.util.Stack;

public class Solution {
	public boolean isValidParentheses(String s) {
        // Write your code here
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(' || c == '[' || c == '{') {
				stack.push(c);
			}
			else {
				if(stack.isEmpty()) return false;
				else {
					if(c == ')' && stack.peek() == '(') stack.pop();
					else if(c == ']' && stack.peek() == '[') stack.pop();
					else if(c == '}' && stack.peek() == '{') stack.pop();
					else return false;
				}
			}
		}
		return stack.size() == 0;
    }
}
