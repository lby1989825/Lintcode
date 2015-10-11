package SortLettersbyCase;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String str = "ABCabcABCabcABDababbaksafkjsakfjaksjfkaAKJKFJAKkjkfakjA";
		char[] chars = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			chars[i] = str.charAt(i);
		}
		s.sortLetters(chars);
	}

}
