package com.code.secondsprint;

import java.util.ArrayList;

public class SwapNodeInPairs {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int val){
			this.val=val;
		}
	}
	public static void swap(int a, int b) {
		int dup = a;
		a = b; 
		b = dup;
	}
	public static void swapPairs(ListNode head) {
		ListNode temp = head;
		int size = 0;
		while(temp!=null) {
			temp = temp.next;
			size++;
		}
		
		int[] arr1 = new int[size];
		temp=head;
		int i = 0;
		for (int j = 0; j < arr1.length; j++) {
			
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
		
		swapPairs(a);
	}
}
