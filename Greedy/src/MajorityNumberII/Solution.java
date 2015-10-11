package MajorityNumberII;

import java.util.ArrayList;

public class Solution {
    /**
     * @param nums: A list of integers
     * @return: The majority number that occurs more than 1/3
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
    	if(nums.get(0) != nums.get(1)) {
    		int m1 = nums.get(0), m2 = nums.get(1), count1 = 1, count2 = 1;
        	for(int i = 1; i < nums.size(); i++) {
        		if(nums.get(i) == m1) count1++;
        		else if(nums.get(i) == m2) count2++;
        		else {
        			count1--;
        			count2--;
        		}
        		if(count1 < 0) {
        			m1 = nums.get(i);
        			count1 = 1;
        		}
        		else if(count2 < 0){
        			m2 = nums.get(i);
        			count2 = 1;
        		}
        	}
        	count1 = 0; count2 = 0;
        	for(int i = 0; i < nums.size(); i++) {
        		if(nums.get(i) == m1) count1++;
        		else if(nums.get(i) == m2) count2++;
        	}
        	if(count1 > nums.size() / 3) return m1;
        	else return m2;
    	}
    	else {
    		int j = 1;
    		while(j < nums.size() && nums.get(j) == nums.get(0)) j++;
    		if(j == nums.size()) return nums.get(0);
    		int m1 = nums.get(0), m2 = nums.get(j), count1 = j, count2 = 1;
    		for(int i = j + 1; i < nums.size(); i++) {
        		if(nums.get(i) == m1) count1++;
        		else if(nums.get(i) == m2) count2++;
        		else {
        			count1--;
        			count2--;
        		}
        		if(count1 < 0) {
        			m1 = nums.get(i);
        			count1 = 1;
        		}
        		else if(count2 < 0){
        			m2 = nums.get(i);
        			count2 = 1;
        		}
        	}
        	count1 = 0; count2 = 0;
        	for(int i = 0; i < nums.size(); i++) {
        		if(nums.get(i) == m1) count1++;
        		else if(nums.get(i) == m2) count2++;
        	}
        	if(count1 > nums.size() / 3) return m1;
        	else return m2;
    	}
    }
}
