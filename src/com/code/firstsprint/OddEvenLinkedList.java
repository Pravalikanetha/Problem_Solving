package com.code.firstsprint;

import java.util.ArrayList;
import java.util.List;

public class OddEvenLinkedList {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(){};
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next){ this.val=val; this.next = next;}
	}

	public static ListNode oddEvenList(ListNode head) {
		if(head==null) {
			return null;
		}
		ListNode temp = head;
		List<Integer> list = new ArrayList<>();
		while(temp!=null && temp.next!=null) {
			list.add(temp.val);
			temp = temp.next.next;
		}
		if(temp!=null) list.add(temp.val);
		temp = head;
		temp = temp.next;
		while(temp!=null && temp.next!=null) {
			list.add(temp.val);
			temp = temp.next.next;
		}
		if(temp!=null) list.add(temp.val);
		temp = head;
		int i=0;
		while(temp!=null) {
			temp.val = list.get(i);
			i++;
			temp = temp.next;
		}
		System.out.println(list);
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
		ListNode f = new ListNode(6);
		ListNode e = new ListNode(5,f);
		ListNode d = new ListNode(4,e);
		ListNode c = new ListNode(3,d);
		ListNode b = new ListNode(2,c);
		ListNode a = new ListNode(1,b);
		ListNode ans = oddEvenList(a);
		display(ans);
	}
}
