package MergekSortedLists;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ListNode> lists = new ArrayList<ListNode>();
		ListNode a = new ListNode(-1);
		ListNode b = new ListNode(5);
		ListNode c = new ListNode(11);
		a.next = b;
		b.next = c;
		c.next = null;
		ListNode d = new ListNode(6);
		ListNode e = new ListNode(10);
		d.next = e;
		e.next = null;
		lists.add(null);
		lists.add(a);
		lists.add(null);
		lists.add(d);
		Solution s = new Solution();
		ListNode res = s.mergeKLists(lists);
		System.out.println(res);
	}

}
