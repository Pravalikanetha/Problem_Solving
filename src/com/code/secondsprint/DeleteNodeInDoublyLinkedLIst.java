package com.code.secondsprint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeleteNodeInDoublyLinkedLIst {
	public static class Node {
		int val;
		Node next;
		Node prev;
		Node(int val){
			this.val=val;
		}
		Node(int val,Node next){
			this.val=val;
			this.next = next;
			prev = null;
		}
	}
	public static Node deleteTail(Node head) {
		Node tail = head;
		while(tail.next!=null) {
			tail = tail.next;
		}
		Node back = tail.prev;
		back.next = null;
		tail.prev = null;
		return head;
	}
	public static Node deleteNode(Node head, int x) {
		if(head==null || head.next == null || x <= 0) {
			return null;
		}
		if(x==1) {
			head = head.next;
			head.prev = null;
			return head;
		}
		Node slow = new Node(0);
		slow.next = head;
		Node fast = head;
		for (int i = 1; i < x; i++) {
			slow = slow.next;
			fast = fast.next;
		}
		if(slow.next != null) {
		slow.next = slow.next.next;
		slow.next.prev = slow;
		fast.next = null;
		fast.prev = null;
		}
		return head;
	}
	public static void display(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val);
			if(temp.next!=null) {
				System.out.print("->");
			}
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		Node f = new Node(5);
		Node e = new Node(4,f);
		Node d = new Node(3,e);
		Node c = new Node(7,d);
		Node b = new Node(8,c);
		Node a = new Node(1,b);
		
		b.prev = a;
		c.prev = b;
		d.prev = c;
		e.prev = d;
		f.prev = e;
		
		Node ans = deleteNode(a, 2);
		display(ans);
		
		try {
			List<Integer> li = new ArrayList<>();
			Collections.sort(li);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
