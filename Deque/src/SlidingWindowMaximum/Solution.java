package SlidingWindowMaximum;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    /**
     * @param nums: A list of integers.
     * @return: The maximum number inside the window at each moving.
     */
    public ArrayList<Integer> maxSlidingWindow(int[] nums, int k) {
        // write your code here
    	if(nums.length == 0) return new ArrayList<Integer>();
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	Deque<Integer> deque = new LinkedList<Integer>();
    	for(int i = 0; i < nums.length; i++) {
			if(i >= k && deque.getLast() == nums[i - k]) {
				deque.removeLast();
			}
			while(!deque.isEmpty() && deque.getFirst() < nums[i]) {
				deque.removeFirst();
			}
			deque.addFirst(nums[i]);
			if(i + 1 >= k) res.add(deque.getLast());
		}
    	return res;
    }
}
