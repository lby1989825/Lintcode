package ProductofArrayExcludeItself;

import java.util.ArrayList;

public class Solution {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        ArrayList<Long> res = new ArrayList<Long>();
        res.add((long) 1);
        for(int i = A.size() - 2; i > -1; i--) {
            res.add(0, (long) (A.get(i + 1)) * res.get(0));
        }
        long element = 1;
        for(int i = 0; i < res.size(); i++) {
            res.set(i, res.get(i) * element);
            element *= A.get(i);
        }
        return res;
    }
}
