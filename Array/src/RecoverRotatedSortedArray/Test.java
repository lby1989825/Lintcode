package RecoverRotatedSortedArray;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		Solution s = new Solution();
		s.recoverRotatedSortedArray(nums);
	}

}
