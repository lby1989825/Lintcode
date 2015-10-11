package RemoveDuplicatesfromSortedListII;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of the linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	ListNode p = head;
    	while(p != null) {
    		if(!map.containsKey(p.val)) map.put(p.val, 1);
    		else map.put(p.val, map.get(p.val) + 1);
    		p = p.next;
    	}
    	ListNode header = new ListNode(0);
    	header.next = head;
    	ListNode p3 = header, p1 = head;
    	while(p1 != null) {
    		if(map.get(p1.val) == 1) {
    			p3.next = p1;
    			p1 = p1.next;
    			p3 = p3.next;
    		}
    		else {
    			p1 = p1.next;
    		}
    	}
    	p3.next = p1;
    	return header.next;
    }
}
