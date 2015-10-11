package PermutationsII;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of unique permutations.
     */
    public ArrayList<ArrayList<Integer>> permuteUnique(ArrayList<Integer> nums) {
        // write your code here
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	if(nums.size() == 0) return res;
    	for(int i = 0; i < nums.size(); i++) {
    		res = getNextRes(res, nums.get(i));
    	}
    	removeDuplicate(res);
    	return res;
    }
    
    private void removeDuplicate(ArrayList<ArrayList<Integer>> res) {
		// TODO Auto-generated method stub
		Set<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
		for(int i = 0; i < res.size(); i++) {
			if(!set.contains(res.get(i))) {
				set.add(res.get(i));
			}
			else {
				res.remove(i);
				i--;
			}
		}
	}

	private ArrayList<ArrayList<Integer>> getNextRes(ArrayList<ArrayList<Integer>> in, int num) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(in.size() == 0) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(num);
			res.add(list);
		}
		else {
			for(int i = 0; i < in.size(); i++) {
				ArrayList<Integer> list = in.get(i);
				ArrayList<ArrayList<Integer>> temp = getNextList(list, num);
				res.addAll(temp);
			}
		}
		return res;
	}

	private ArrayList<ArrayList<Integer>> getNextList(ArrayList<Integer> list, int num) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i <= list.size(); i++) {
			ArrayList<Integer> tmp = new ArrayList<Integer>(list);
			tmp.add(i, num);
			res.add(tmp);
		}
		return res;
	}
}
