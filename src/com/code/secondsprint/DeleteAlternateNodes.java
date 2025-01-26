package com.code.secondsprint;

public class DeleteAlternateNodes {
	public static class Node {
		int val;
		Node next;
		Node(int val){
			this.val=val;
			next = null;
		}
	}
	public static void deleteAlt(Node head) {
		Node temp = head;
		while(temp!=null && temp.next!=null) {
			temp.next = temp.next.next;
			temp = temp.next;
		}
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
		Node a = new Node(1);
		Node b = new Node(8);
		Node c = new Node(7);
		Node d = new Node(3);
		Node e = new Node(4);
		Node f = new Node(5);
		Node g = new Node(6);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		f.next=g;
		deleteAlt(a);
		display(a);
	}
}
