package LongestIncreasingContinuoussubsequence;

public class Solution {
    /**
     * @param nums: The integer array
     * @return: The length of LIS (longest increasing subsequence)
     */
    public int longestIncreasingSubsequence(int[] A) {
        // write your code here
        int maxLen = 0;
        if(A.length == 0) return 0;
    	int[] arr = new int[A.length - 1];
    	for(int i = 1; i < A.length; i++) {
    		arr[i - 1] = A[i] - A[i - 1];
    	}
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i] >= 0) {
    			int sum = 0, j = i, k = i, count = 0;
    			while(j < arr.length) {
    				if(arr[j] < 0) count++;
    				sum += arr[j];
    				if(sum >=0) k = j;
    				j++;
    			}
    			maxLen = Math.max(maxLen, k - i + 2 - count);
    		}  
    	}
		return maxLen;
    }
}

