package SingleNumberIII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    /**
     * @param A : An integer array
     * @return : Two integers
     */
    public List<Integer> singleNumberIII(int[] A) {
        // write your code here
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < A.length; i++) {
            if(!map.containsKey(A[i])) map.put(A[i], 1);
            else map.put(A[i], map.get(A[i]) + 1);
        }
        List<Integer> res = new ArrayList<Integer>();
        for(int key: map.keySet()) {
            if(map.get(key) == 1) res.add(key);
        }
        return res;
    }
}
