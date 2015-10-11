package PermutationIndex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    /**
     * @param A an integer array
     * @return a long integer
     */
    public long permutationIndex(int[] A) {
        // Write your code here
    	long res = 0; 
    	int sz = A.length;
    	List<Integer> keyList = new ArrayList<Integer>();
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] B = new int[A.length];
        B = Arrays.copyOf(A, A.length);
        Arrays.sort(B);
        for(int i = 0; i < B.length; i++) {
        	map.put(B[i], i);
        	keyList.add(B[i]);
        }
        for(int i = 0; i < A.length; i++) {
        	res += map.get(A[i]) * factory(sz - 1);
        	change(map, A[i], keyList);
        	sz--;
        }
        return res + 1;
    }
    
    private void change(Map<Integer, Integer> map, int j, List<Integer> keyList) {
		// TODO Auto-generated method stub
    	for(int i = 0; i < keyList.size(); i++) {
    		int k = keyList.get(i);
    		if(k > j) map.put(k, map.get(k) - 1);
    	}
	}

	private long factory(int j) {
		// TODO Auto-generated method stub
		long res = 1;
		for(int i = 1; i <= j; i++) {
			res *= i;
		}
		return res;
	}
}
