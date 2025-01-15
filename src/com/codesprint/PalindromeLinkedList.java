package com.codesprint;

import java.util.Stack;

public class PalindromeLinkedList {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
			next = null;
		}
	}
	public static boolean isPalindrome(ListNode head) {
		Stack<ListNode> st = new Stack<>();
		ListNode temp = head;
		while(temp!=null) {
			st.push(temp);
			temp=temp.next;
		}
		temp=head;
		while(temp!=null) {
			ListNode popping = st.pop();
			if(popping.val!=temp.val) return false;
			temp=temp.next;
		}
		return true;
	}
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(2);
		ListNode e = new ListNode(1);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		boolean yes = isPalindrome(a);
		System.out.println(yes);
	}
}
