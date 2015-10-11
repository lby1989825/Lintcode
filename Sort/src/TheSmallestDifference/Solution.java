package TheSmallestDifference;

import java.util.Arrays;

public class Solution {
    /**
     * @param A, B: Two integer arrays.
     * @return: Their smallest difference.
     */
    public int smallestDifference(int[] A, int[] B) {
        // write your code here
    	int min = Integer.MAX_VALUE;
    	Arrays.sort(A);
    	Arrays.sort(B);
    	for(int i = 0; i < A.length; i++) {
    		int gap = binarySearch(B, A[i]);
    		if(gap == 0) return 0;
    		min = Math.min(gap, min);
    	}
    	return min;
    }
    
    private int binarySearch(int[] A, int target) {
    	int lo = 0, hi = A.length - 1;
    	while(lo <= hi) {
    		int mid = lo + (hi - lo) / 2;
    		if(A[mid] > target) hi = mid - 1;
    		else if(A[mid] < target) lo = mid + 1;
    		else return 0;
    	}
    	if(lo == A.length) return Math.abs(A[A.length - 1] - target);
    	else if(hi == -1) return Math.abs(A[0] - target);
    	else return Math.min(Math.abs(A[hi] - target), Math.abs(A[lo] - target));
    }
}
