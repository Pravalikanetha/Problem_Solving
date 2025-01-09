package codeSprint1;

import java.util.HashMap;

public class LinkedListCycle {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
			next = null;
		}
	}
	public static boolean hasCycle(ListNode head) {
		HashMap<ListNode, Integer> hm = new HashMap<>();
		ListNode temp = head;
		while(temp!=null) {
			if(!hm.containsKey(temp)) {
				hm.put(temp, 1);
			}else if(hm.containsKey(temp)) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	public static boolean Cycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(-4);
		ListNode e = new ListNode(-5);
		a.next = e;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = b;
		System.out.println(Cycle(a));
	}
}
