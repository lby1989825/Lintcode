package ReverseLinkedListII;

public class Solution {
    /**
     * @param ListNode head is the head of the linked list 
     * @oaram m and n
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m , int n) {
        // write your code
    	ListNode header = new ListNode(0);
    	header.next = head;
    	ListNode preStart = header, postEnd = head;
    	int count1 = m - 1, count2 = n;
    	while(count1 > 0) {
    		preStart = preStart.next;
    		count1--;
    	}
    	while(count2 > 0) {
    		postEnd = postEnd.next;
    		count2--;
    	}
    	ListNode first = preStart.next, second = first.next, end = first;;
    	while(second != null && second != postEnd) {
    		ListNode temp = second.next;
    		second.next = first;
    		first = second;
    		second = temp;
    	}
    	preStart.next = first;
    	end.next = postEnd;
    	return header.next;
    }
}
