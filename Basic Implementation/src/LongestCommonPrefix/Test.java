package LongestCommonPrefix;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = new String[]{"abc","abcd","","ab","ac"};
		Solution s = new Solution();
		String res = s.longestCommonPrefix(strs);
		System.out.println(res);
	}

}
