package com.codesprint;

public class MiddleNodeOfLinkedList {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}
	public static void display(ListNode head) {
		ListNode temp = head;
		while(temp!=null) {
			System.out.print(temp.val); 
	        if (temp.next != null) {
	            System.out.print("->"); 
	        }
			temp=temp.next;
		}
	}
	public static ListNode middle(ListNode head) {
		ListNode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		int mid = count;
		temp = head;
		while(temp!=null) {
			mid = mid-1;
			if(mid==0) {
				break;
			}
			temp=temp.next;
		}
		return temp;
		
	}
	public static ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
//			System.out.println(slow.val);
			fast = fast.next.next;
		}
		return slow;
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
	public static void displayR(ListNode head) {
		if(head==null)return;
		System.out.println(head.val);
		displayR(head.next);
	}
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		ListNode f = new ListNode(6);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		ListNode middle = middleNode(a);
		System.out.println("Middle Node: " + middle.val);
		displayR(a);
		b = reverseList(a);

	    // Display the reversed linked list
	    System.out.println("Reversed Linked List:");
	    displayR(b);
	}
}
