package APlusBProblem;

public class Solution {
	public int aplusb(int a, int b) {
        // write your code here, try to do it without arithmetic operators.
    	if(b == 0) return a;
    	int sum = a ^ b;           //adding without carry
    	int carry = (a & b) << 1;  //carry but don`t add
    	return aplusb(sum, carry); //recurse get the result
    }
}
