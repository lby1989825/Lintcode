package SpaceReplacement;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String str = "Mr John Smith";
		char[] string = new char[18];
		for(int i = 0; i < str.length(); i++) {
			string[i] = str.charAt(i);
		}
		s.replaceBlank(string, 13);
	}
}
