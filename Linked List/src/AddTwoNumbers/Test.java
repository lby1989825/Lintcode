package AddTwoNumbers;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		ListNode a = new ListNode(3);
		ListNode b = new ListNode(1);
		ListNode c = new ListNode(5);
		a.next = b;
		b.next = c;
		c.next = null;
		ListNode A = new ListNode(5);
		ListNode B = new ListNode(9);
		ListNode C = new ListNode(2);
		A.next = B;
		B.next = C;
		C.next = null;
		s.addLists(a, A);
	}

}
