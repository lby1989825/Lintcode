package JumpGameII;

public class Solution {
    /**
     * @param A: A list of lists of integers
     * @return: An integer
     */
    public int jump(int[] A) {
        // write your code here
    	int step = 0, reach = 0, lastReach = 0;
    	for(int i = 0; i <= reach && i < A.length; i++) {
    		if(i > lastReach) {
                step++;
                lastReach = reach;
            }
            reach = Math.max(reach, A[i] + i);
    	}
    	return reach >= A.length - 1 ? step : 0;
    }
}


