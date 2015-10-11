package MergeSortedArray;

class Solution {
    /**
     * @param A: sorted integer array A which has m elements, 
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
    	int i = 0, j = 0;
    	while(i < m && j < n) {
    		if(A[i] <= B[j]) i++;
    		else if(A[i] > B[j]) {
    			System.arraycopy(A, i, A, i + 1, m - i);
    			m++;
    			A[i++] = B[j++];
    		}
    	}
    	while(j < n) {
    		A[i++] = B[j++];
    	}
    }
}
