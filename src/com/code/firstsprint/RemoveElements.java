package com.code.firstsprint;

public class RemoveElements {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	public static ListNode removeElements(ListNode head, int val) {
		if(head == null) {
			return null;
		}
		ListNode temp = new ListNode(0);
		temp.next = head;
		while(temp!=null && temp.next!=null) {
			if(head.val == val) {
				head = head.next;
			}
			if(temp.next.val == val) {
				temp.next = temp.next.next;
			}else {
				temp = temp.next;
			}
		}
		return head;
	}
	public static void display(ListNode head) {
		ListNode temp = head;
		while(temp!=null) {
			System.out.print(temp.val);
			if(temp.next!=null) System.out.print("->");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		ListNode g = new ListNode(7);
		ListNode f = new ListNode(7,g); 
		ListNode e = new ListNode(7,f);
		ListNode d = new ListNode(7,e); 
		ListNode c = new ListNode(7,d); 
		ListNode b = new ListNode(7,c); 
		ListNode a = new ListNode(7,b); 
		ListNode ans = removeElements(a,7);
		display(ans);
	}
}
