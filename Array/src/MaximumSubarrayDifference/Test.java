package MaximumSubarrayDifference;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(-3);
		nums.add(1);
		int res = s.maxDiffSubArrays(nums);
		System.out.println(res);
	}

}
