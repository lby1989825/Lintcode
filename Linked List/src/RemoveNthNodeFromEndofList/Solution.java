package RemoveNthNodeFromEndofList;

public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        ListNode header = new ListNode(0);
        header.next = head;
        ListNode p1 = head, p2 = header;
        while(n > 0) {
        	p1 = p1.next;
        	n--;
        }
        while(p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;
        return header.next;
    }
}
