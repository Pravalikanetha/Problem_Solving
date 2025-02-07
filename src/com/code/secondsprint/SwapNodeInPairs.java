package com.code.secondsprint;

public class SwapNodeInPairs {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int val){
			this.val=val;
		}
	}
	
	public static ListNode swapPairs(ListNode head) {
		if(head == null) {
			return null;
		}
		if(head.next == null) {
			return head;
		}
		int size = 0;
		ListNode first = head;
		while(first!=null) {
			size++;
			first = first.next;
		}
		first = head;
		ListNode second = head.next;
		int i = 0;
		int j = 1;
		int[] arr = new int[size];
		while(second!=null && second.next!=null) {
			arr[i] = second.val;
			arr[j] = first.val;
			first = first.next.next;
			second = second.next.next;
			i += 2;
			j += 2;
		}
		if(second!=null){arr[size-2] = second.val;}
		arr[size-1] = first.val;
		first = head;
		int k = 0;
		while(first!=null) {
			first.val = arr[k];
			k++;
			first = first.next;
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
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		ListNode ans = swapPairs(a);
		display(ans);
	}
}
