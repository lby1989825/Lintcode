package HashFunction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub ubuntu
		Solution s = new Solution();
		char[] key = new char[]{'a', 'b', 'c', 'd'};
		int res = s.hashCode(key, 100);
		System.out.println(res);
		System.out.println();
	}

}
