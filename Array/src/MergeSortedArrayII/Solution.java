package MergeSortedArrayII;

import java.util.ArrayList;

class Solution {
    /**
     * @param A and B: sorted integer array A and B.
     * @return: A new sorted integer array
     */
    public ArrayList<Integer> mergeSortedArray(ArrayList<Integer> A, ArrayList<Integer> B) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        int i = 0, j = 0;
        while(i < A.size() && j < B.size()) {
        		if(A.get(i) <= B.get(j)) res.add(A.get(i++));
                else res.add(B.get(j++));
        }
        res.addAll(A.subList(i, A.size()));
        res.addAll(B.subList(j, B.size()));
        return res;
    }
}
