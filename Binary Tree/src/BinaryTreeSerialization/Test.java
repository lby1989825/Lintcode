package BinaryTreeSerialization;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		TreeNode t = s.deserialize("{}");
		System.out.println(t);
		String res = s.serialize(t);
		System.out.println(res);
	}

}
