package com.codeSprint;

public class DeleteTheMiddleNode {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int val){
			this.val=val;
		}
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
	public static ListNode deleteMiddle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		fast=fast.next.next;
		while (fast != null && fast.next != null) {
			slow = slow.next; 
		    fast = fast.next.next;
		}
		slow.next = slow.next.next;
		System.out.println(slow.val);
		return head;
	}
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(4);
		ListNode d = new ListNode(7);
		ListNode e = new ListNode(1);
		ListNode f = new ListNode(2);
		ListNode g = new ListNode(6);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		deleteMiddle(a);
		display(a);
	}
}
