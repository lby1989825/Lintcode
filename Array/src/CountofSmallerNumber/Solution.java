package CountofSmallerNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	   /**
	     * @param A: An integer array
	     * @return: The number of element in the array that 
	     *          are smaller that the given integer
	     */
	public ArrayList<Integer> countOfSmallerNumber(int[] A, int[] queries) {
		// write your code here
		ArrayList<Integer> res = new ArrayList<Integer>();
		Arrays.sort(A);
		for(int i = 0; i < queries.length; i++) {
			int index = binarySearch(A, queries[i]);
			res.add(index);
		}
		return res;
	}

	private int binarySearch(int[] A, int target) {
		// TODO Auto-generated method stub
		int lo = 0, hi = A.length - 1;
		while(lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if(A[mid] < target) lo = mid + 1;
			else if(A[mid] > target) hi = mid - 1;
			else return getLeast(A, mid);
		}
		return Math.min(lo, hi) + 1;
	}

	private int getLeast(int[] A, int k) {
		// TODO Auto-generated method stub
		while(k - 1 > -1 && A[k] == A[k - 1]) k--;
		return k;
	}
}

