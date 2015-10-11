package CoinsinaLineII;

public class Solution {
    /**
     * @param values: an array of integers
     * @return: a boolean which equals to true if the first player will win
     */
    public boolean firstWillWin(int[] values) {
        // write your code here
    	if(values.length < 3) return true;
    	int firstSum = 0, secondSum = 0, flag = 0;
    	for(int i = 0; i < values.length; i++) {
    		if(flag == 0) {
    			firstSum += values[i];
    			if(i + 1 < values.length && values[i + 1] >= values[i]) {
    				firstSum += values[++i];
    			}
    		}
    		else {
    			secondSum += values[i];
    			if(i + 1 < values.length && values[i + 1] >= values[i]) {
    				secondSum += values[++i];
    			}
    		}
    		flag = Math.abs(flag - 1);
    	}
    	return firstSum > secondSum;
    }
}
