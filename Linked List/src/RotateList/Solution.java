package RotateList;

public class Solution {
    /**
     * @param head: the List
     * @param k: rotate to the right k places
     * @return: the list after rotation
     */
    public ListNode rotateRight(ListNode head, int k) {
        // write your code here
    	if(head == null) return null;
        if(k == 0) return head;
    	ListNode header = new ListNode(0);
    	header.next = head;
    	ListNode p1 = header, p2 = head, p3 = head, p4 = head;
    	int n = 0;
    	while(p4 != null) {
    		p4 = p4.next;
    		n++;
    	}
    	if(n == 1) return head;
    	k = k % n;
    	while(k > 0 && p3 != null) {
    		p3 = p3.next;
    		k--;
    	}
    	while(p3 != null) {
    		p1 = p1.next;
    		p2 = p2.next;
    		p3 = p3.next;
    	}
    	p3 = p2;
    	while(p3.next != null) {
    		p3 = p3.next;
    	}
    	p1.next = null;
    	if(p3 != head) p3.next = head;
    	return p2;
    }
}

