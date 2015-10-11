package CombinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /**
     * @param num: Given the candidate numbers
     * @param target: Given the target number
     * @return: All the combinations that sum to target
     */
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        // write your code here
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if(num.length == 0) return res;
    	List<Integer> list = new ArrayList<Integer>();
    	Arrays.sort(num);
    	helper(num, 0, target, list, res);
    	return res;
    }

	private void helper(int[] num, int start, int target, List<Integer> list, List<List<Integer>> res) {
		// TODO Auto-generated method stub
		if(target < 0) return;
		if(target == 0) {
			if(!res.contains(list)) res.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i = start; i < num.length; i++) {
			list.add(num[i]);
			helper(Arrays.copyOfRange(num, 1, num.length), i, target - num[i], list, res);
			list.remove(list.size() - 1);
		}
	}
}
