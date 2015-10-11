package InsertionSortList;

public class Solution {
    /**
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        // write your code here
    	if(head == null) return head;
    	ListNode cur = head.next;
    	while(cur != null) {
    		ListNode p = head;
    		while(p != cur) {
    			if(p.val > cur.val) {
    				int temp = p.val;
        			p.val = cur.val;
        			cur.val = temp;
    			}
    			p = p.next;
    		}
    		cur = cur.next;
    	}
    	return head;
    }
}

