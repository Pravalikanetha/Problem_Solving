package com.code.firstsprint;

 public class ReverseLinkedList {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int val){
			this.val=val;
		}
	}
	public static ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp ;
            temp = front;
        }
        return prev;
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
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(4);
		ListNode d = new ListNode(7);
		ListNode e = new ListNode(9);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		ListNode rev = reverseList(a);
		display(rev);
	}
}
