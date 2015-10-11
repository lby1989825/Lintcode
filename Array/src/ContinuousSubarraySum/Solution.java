package ContinuousSubarraySum;

import java.util.ArrayList;

public class Solution {
    /** 
     * -3, 1, 3
     * @param A an integer array
     * @return  A list of integers includes the index of the first number and the index of the last number
     */
    public ArrayList<Integer> continuousSubarraySum(int[] A) {
        // Write your code here
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	int max = Integer.MIN_VALUE, sum = 0, start = 0, end = 0;
    	while(end < A.length) {
    		if(sum + A[end] >= A[end]) {
    			sum += A[end];
    			if(sum > max) {
    				getRes(start, end, res);
    				max = sum;
    			}
    		}
    		else {
    			sum = A[end];
    			start = end;
    			if(sum > max) {
    				getRes(start, end, res);
    				max = sum;
    			}
    		}
    		end++;
    	}
		return res;
    }

	private void getRes(int start, int end, ArrayList<Integer> res) {
		// TODO Auto-generated method stub
		res.clear();
		res.add(start);
		res.add(end);
	}
}
