package FourSum;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    /**
     * @param numbers : Give an array numbersbers of n integer
     * @param target : you need to find four elements that's sum of target
     * @return : Find all unique quadruplets in the array which gives the sum of
     *           zero.
     */
    public ArrayList<ArrayList<Integer>> fourSum(int[] numbers, int target) {     
        //write your code here
    	Arrays.sort(numbers);
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	for(int i = 0; i < numbers.length - 3; i++) {
    		for(int j = i + 1; j < numbers.length - 2; j++) {
    			int result = target - numbers[i] - numbers[j];
    			int p = j + 1, q = numbers.length - 1;
    			while(p < q) {
    				if(numbers[p] + numbers[q] < result) p++;
    				else if(numbers[p] + numbers[q] > result) q--;
    				else {
    					ArrayList<Integer> list = new ArrayList<Integer>();
    					list.add(numbers[i]);
    					list.add(numbers[j]);
    					list.add(numbers[p]);
    					list.add(numbers[q]);
    					if(!res.contains(list)) res.add(list);
    					p++;
    					q--;
    				}
    			}
    		}
    	}
		return res;
    }
}
