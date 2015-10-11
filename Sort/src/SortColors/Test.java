package SortColors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.sortColors(new int[]{1, 0, 1, 2});
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 0; i < str.length(); i++) {
			int t = str.charAt(i);
			System.out.println(t);
		}
	}

}
