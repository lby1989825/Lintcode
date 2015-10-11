package Backpack;

import java.util.Arrays;

public class Solution {
    /** 1,3,5,7
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
	private int max = 0;
    public int backPack(int m, int[] A) {
        // write your code here
        for(int i = 0; i < A.length; i++) {
            int[] B = Arrays.copyOfRange(A, i, A.length);
            int[] sum = new int[B.length];
            sum[0] = B[0];
            for(int j = 1; j < sum.length; j++) {
            	sum[j] += sum[j - 1] + B[j];
            	if(sum[j] < m) max = Math.max(sum[j], max);
            	else break;
            }
        }
        return max;
    }
}
