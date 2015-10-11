package CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /**
     * @param candidates: A list of integers
     * @param target:An integer
     * @return: A list of lists of integers
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // write your code here
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if(candidates.length == 0) return res;
    	List<Integer> list = new ArrayList<Integer>();
    	Arrays.sort(candidates);
    	helper(candidates, 0, target, list, res);
    	return res;
    }

	private void helper(int[] candidates, int start, int target, List<Integer> list, List<List<Integer>> res) {
		// TODO Auto-generated method stub
		if(target < 0) return;
		if(target == 0) {
			res.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i = start; i < candidates.length; i++) {
			list.add(candidates[i]);
			helper(candidates, i, target - candidates[i], list, res);
			list.remove(list.size() - 1);
		}
	}
}
