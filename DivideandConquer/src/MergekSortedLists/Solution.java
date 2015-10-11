package MergekSortedLists;

import java.util.List;

public class Solution {
    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    public ListNode mergeKLists(List<ListNode> lists) {  
        // write your code here
    	return mergeKLists(lists, 0, lists.size() - 1);
    }

	private ListNode mergeKLists(List<ListNode> lists, int lo, int hi) {
		// TODO Auto-generated method stub
		if(lo == hi) return lists.get(lo);
		int mid = lo + (hi - lo) / 2;
		ListNode p1 = mergeKLists(lists, lo, mid);
		ListNode p2 = mergeKLists(lists, mid + 1, hi);
		return mergeTwoListNode(p1, p2);
	}

	private ListNode mergeTwoListNode(ListNode head1, ListNode head2) {
		// TODO Auto-generated method stub
		ListNode header = new ListNode(0);
		ListNode p3 = header;
		ListNode p1 = head1, p2 = head2;
		while(p1 != null && p2 != null) {
			if(p1.val >= p2.val) {
				p3.next = p2;
				p2 = p2.next;
			}
			else {
				p3.next = p1;
				p1 = p1.next;
			}
			p3 = p3.next;
		}
		if(p2 == null) p3.next = p1;
		else p3.next = p2;
		return header.next;
	}
}
