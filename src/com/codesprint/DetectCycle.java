package com.codesprint;

import java.util.HashMap;

public class DetectCycle {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
			next = null;
		}
	}
	public static ListNode detectCycle(ListNode head) {
		HashMap<ListNode, Integer> hm = new HashMap<>();
		ListNode temp = head ;
		if(head == null || head.next == null) {
			return null;
		}
		while(temp!=null) {
			if(!hm.containsKey(temp)) {
				hm.put(temp, 1);
			}else if(hm.containsKey(temp)) {
				break;
			}
			temp= temp.next;
		}
		return temp;
	}
	public static ListNode Cycle(ListNode head) {
		if(head == null || head.next == null) { return null;}
		ListNode slow = head;
		ListNode fast = head;
		boolean flag = false;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				flag = true;
				break;
			}
		}
		slow = head; 
		if(flag) {
			while(slow!=fast) {
				slow = slow.next;
				fast = fast.next;
			}
		}
		return slow;
	}
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = b;
		ListNode loop = Cycle(a);
		if(loop == null) {
			System.out.println("it is null");
		}else {
		System.out.println(loop.val);
		}
	}
}
