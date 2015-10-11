package InsertionSortList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(2);
		ListNode d = new ListNode(0);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = null;
		s.insertionSortList(a);
	}

}
