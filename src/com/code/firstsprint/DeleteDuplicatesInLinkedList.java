package com.code.firstsprint;

public class DeleteDuplicatesInLinkedList {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	public static ListNode Duplicates(ListNode head) {
		ListNode temp = head;
		while(temp!=null && temp.next!=null) {
			if(temp.val == temp.next.val) {
				ListNode front = temp.next.next;
					temp.next = front;
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
		ListNode e = new ListNode(9);
		ListNode d = new ListNode(3,e); 
		ListNode c = new ListNode(1,d); 
		ListNode b = new ListNode(1,c); 
		ListNode a = new ListNode(1,b); 
		ListNode ans = Duplicates(a);
		display(ans);
	}
}
