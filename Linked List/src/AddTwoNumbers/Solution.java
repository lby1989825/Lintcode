package AddTwoNumbers;

public class Solution {
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode p1 = l1, p2 = l2, l3 = new ListNode(0), p3 = l3;
        int carry = 0;
        while(p1 != null && p2 != null) {
            p3.next = new ListNode((p1.val + p2.val + carry) % 10);
            carry = (p1.val + p2.val + carry) / 10;
            p1 = p1.next;
            p2 = p2.next;
            p3 = p3.next;
        }
        while(p1 != null) {
            p3.next = new ListNode((p1.val + carry) % 10);
            carry = (p1.val + carry) / 10;
            p1 = p1.next;
            p3 = p3.next;
        }
        while(p2 != null) {
            p3.next = new ListNode((p2.val + carry) % 10);
            carry = (p2.val + carry) / 10;
            p2 = p2.next;
            p3 = p3.next;
        }
        if(carry == 1) {
            p3.next = new ListNode(1);
            p3 = p3.next;
            p3.next = null;
        }
        else p3.next = null;
        return l3.next;
    }
}
