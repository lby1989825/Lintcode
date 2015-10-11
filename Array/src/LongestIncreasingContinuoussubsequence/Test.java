package LongestIncreasingContinuoussubsequence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[]{10,1,11,2,12,3,11};
		Solution s = new Solution();
		int res = s.longestIncreasingSubsequence(A);
		System.out.println(res);
	}

}
