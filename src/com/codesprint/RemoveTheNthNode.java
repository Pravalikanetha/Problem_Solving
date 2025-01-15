package com.codesprint;

public class RemoveTheNthNode {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int val){
			this.val=val;
		}
	}
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode fast = temp;
		ListNode slow = temp;
		
		for (int i = 0; i <= n; i++) {
			fast = fast.next;
		}
		while(fast!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		slow.next=slow.next.next;
		return temp.next;
	}
	public static void display(ListNode head) {
		ListNode temp = head;
		while(temp!=null) {
			System.out.print(temp.val);
			if(temp.next!=null) {
				System.out.print("->");
			}
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
//		ListNode b = new ListNode(3);
//		ListNode c = new ListNode(4);
//		ListNode d = new ListNode(7);
//		ListNode e = new ListNode(9);
//
//		a.next = b;
//		b.next = c;
//		c.next = d;
//		d.next = e;
		System.out.println(removeNthFromEnd(a, 1));
		display(a);
	}
}
