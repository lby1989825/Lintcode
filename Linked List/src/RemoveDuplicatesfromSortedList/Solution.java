package RemoveDuplicatesfromSortedList;

public class Solution {
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) { 
        // write your code here
    	if(head == null) return head;
    	ListNode pre = head, cur = head.next;
    	while(cur != null) {
    		if(pre.val == cur.val) {
    			cur = cur.next;
    			pre.next = cur;
    		}
    		else {
    			pre = pre.next;
    			cur = cur.next;
    		}
    	}
    	return head;
    }  
}
