package JumpGame;

public class Solution {
    /**
     * @param A: A list of integers
     * @return: The boolean answer
     */
    public boolean canJump(int[] A) {
        // wirte your code here
    	int reach = 0;
    	for(int i = 0; i <= reach && i < A.length; i++) {
    		reach = Math.max(A[i] + i, reach);
    	}
    	return reach >= A.length - 1;
    }
}
