package Rehashing;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode[] hashTable = new ListNode[20];
		ListNode a = new ListNode(80);
		a.next = null;
		ListNode b = new ListNode(187);
		b.next = null;
		ListNode c = new ListNode(49);
		ListNode d = new ListNode(109);
		c.next = d;
		d.next = null;
		ListNode e = new ListNode(10);
		ListNode f = new ListNode(50);
		ListNode g = new ListNode(-10);
		e.next = f;
		f.next = g;
		g.next = null;
		ListNode h = new ListNode(12);
		h.next = null;
		ListNode i = new ListNode(53);
		ListNode j = new ListNode(133);
		ListNode k = new ListNode(153);
		ListNode l = new ListNode(93);
		i.next = j;
		j.next = k;
		k.next = l;
		l.next = null;
		ListNode m = new ListNode(15);
		m.next = null;
		ListNode n = new ListNode(36);
		n.next = null;
		ListNode o = new ListNode(-3);
		o.next = null;
		ListNode p = new ListNode(118);
		p.next = null;
		ListNode r = new ListNode(159);
		ListNode t = new ListNode(139);
		r.next = t;
		t.next = null;
		Arrays.fill(hashTable, null);
		hashTable[0] = a;
		hashTable[7] = b;
		hashTable[9] = c;
		hashTable[10] = e;
		hashTable[12] = h;
		hashTable[13] = i;
		hashTable[15] = m;
		hashTable[16] = n;
		hashTable[17] = o;
		hashTable[18] = p;
		hashTable[19] = r;
		Solution s = new Solution();
		s.rehashing(hashTable);
	}

}
