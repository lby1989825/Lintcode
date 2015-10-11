package WordBreak;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> dict = new HashSet<String>();
		dict.add("lint");
		dict.add("code");
		Solution s = new Solution();
		s.wordBreak("lintcode", dict);
	}

}
