package SearchforaRange;

import java.util.ArrayList;

public class Solution {
    /** 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public ArrayList<Integer> searchRange(ArrayList<Integer> A, int target) {
        // write your code here
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	int index = binarySearch(A, target);
    	if(index == -1) {
    		res.add(-1);
    		res.add(-1);
    	}
    	else {
    		res = getRange(A, index);
    	}
    	return res;
    }

	private ArrayList<Integer> getRange(ArrayList<Integer> A, int index) {
		// TODO Auto-generated method stub
		ArrayList<Integer> res = new ArrayList<Integer>();
		int target = A.get(index);
		int lo = index, hi = index;
		while(lo > -1 && A.get(lo) == target) lo--;
		while(hi < A.size() && A.get(hi) == target) hi++;
		res.add(lo + 1);
		res.add(hi - 1);
		return res;
		
	}

	private int binarySearch(ArrayList<Integer> A, int target) {
		// TODO Auto-generated method stub
		int lo = 0, hi = A.size() - 1;
		while(lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if(A.get(mid) < target) lo = mid + 1;
			else if(A.get(mid) > target) hi = mid - 1;
			else return mid;
		}
		return -1;
	}
}
