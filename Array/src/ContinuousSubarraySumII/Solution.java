package ContinuousSubarraySumII;

import java.util.ArrayList;

public class Solution {
    /**[3, 1, -100, -3, 4]
     * @param A an integer array
     * @return  A list of integers includes the index of the first number and the index of the last number
     */
    public ArrayList<Integer> continuousSubarraySumII(int[] A) {
        // Write your code here
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	int arrSum = 0;
    	for(int i = 0; i < A.length; i++) arrSum += A[i];
    	ArrayList<Integer> list1 = getMaxSum(A);
    	ArrayList<Integer> list2 = getMinSum(A);
    	int max1 = list1.get(2), max2 = arrSum - list2.get(2);
    	if(max1 >= max2 || list2.get(2) == arrSum) {
    		res.addAll(list1.subList(0, 2));
    	}
    	else {
    		res.add(list2.get(1) + 1);
    		res.add(list2.get(0) - 1);
    	}
    	return res;
    }

	private ArrayList<Integer> getMinSum(int[] A) {
		// TODO Auto-generated method stub
		ArrayList<Integer> res = new ArrayList<Integer>();
		int sum = 0, start = 0, end = 0, min = Integer.MAX_VALUE;
		while(end < A.length) {
			if(sum + A[end] <= A[end]) {
				sum += A[end];
				if(sum < min) {
					getRes(start, end, sum, res);
					min = sum;
				}
			}
			else {
    			sum = A[end];
    			start = end;
    			if(sum < min) {
    				getRes(start, end, sum, res);
    				min = sum;
    			}
    		}
    		end++;
		}
		return res;
		
	}

	private ArrayList<Integer> getMaxSum(int[] A) {
		// TODO Auto-generated method stub
		ArrayList<Integer> res = new ArrayList<Integer>();
		int sum = 0, start = 0, end = 0, max = Integer.MIN_VALUE;
    	while(end < A.length) {
    		if(sum + A[end] >= A[end]) {
    			sum += A[end];
    			if(sum > max) {
    				getRes(start, end, sum, res);
    				max = sum;
    			}
    		}
    		else {
    			sum = A[end];
    			start = end;
    			if(sum > max) {
    				getRes(start, end, sum, res);
    				max = sum;
    			}
    		}
    		end++;
    	}
		return res;
	}
	
	private void getRes(int start, int end, int m, ArrayList<Integer> res) {
		// TODO Auto-generated method stub
		res.clear();
		res.add(start);
		res.add(end);
		res.add(m);
	}
}
