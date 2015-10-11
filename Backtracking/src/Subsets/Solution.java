package Subsets;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> S) {
        // write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(S == null || S.size() == 0) return res;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.sort(S);
        res.add(list);
        for(int i = 0; i < S.size(); i++) {
            ArrayList<ArrayList<Integer>> next = getNext(res, S.get(i));
            next.addAll(res);
            res = next;
        }
        return res;
    }
    
    private ArrayList<ArrayList<Integer>> getNext(ArrayList<ArrayList<Integer>> res, int k) {
        ArrayList<ArrayList<Integer>> next = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < res.size(); i++) {
        	temp.add(new ArrayList<Integer>(res.get(i)));
        }
        for(int i = 0; i < temp.size(); i++) {
            ArrayList<Integer> list = temp.get(i);
            list.add(k);
            next.add(list);
        }
        return next;
    }
}
