package Rehashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /**
     * @param hashTable: A list of The first node of linked list
     * @return: A list of The first node of linked list which have twice size
     */
	private int size = 0;
    public ListNode[] rehashing(ListNode[] hashTable) {
        // write your code here
    	int capacity = hashTable.length;
    	List<Integer> list = new ArrayList<Integer>();
    	for(ListNode p: hashTable) {
    		if(p != null) {
    			changeList(p, list);
    		} 
    	}
    	if(size < capacity / 10) return hashTable;
    	else {
    		capacity *= 2;
    		ListNode[] newTable = new ListNode[capacity];
    		Arrays.fill(newTable, null);
    		for(int k : list) {
    			int t = (k % capacity + capacity) % capacity;
    			if(newTable[t] == null) {
    				newTable[t] = new ListNode(k);
    				newTable[t].next = null;
    			}
    			else {
    				ListNode p = newTable[t];
    				while(p.next != null) {
    					p = p.next;
    				} 
    				p.next = new ListNode(k);
    			}
    		}
    		return newTable;
    	}
    }

	private void changeList(ListNode p, List<Integer> list) {
		// TODO Auto-generated method stub
		while(p != null) {
			size++;
			list.add(p.val);
			p = p.next;
		}
		
	}
};

