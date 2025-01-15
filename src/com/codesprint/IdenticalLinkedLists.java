package com.codesprint;

public class IdenticalLinkedLists {
	static class Node {
		int data;
		Node next;

		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public static boolean areIdentical(Node head1, Node head2) {
		Node temp1 = head1;
		Node temp2 = head2;
 		while(temp1!=null && temp2!=null) {
			if(temp1.data!=temp2.data) {
				return false;
			}
			temp1=temp1.next;
			temp2=temp2.next;
		}
		return true;
	}
	public static void main(String[] args) {
		Node a = new Node(0);
		Node b = new Node(1);
		Node c = new Node(2);
		Node d = new Node(3);
		Node e = new Node(4);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		
		Node v = new Node(0);
		Node w = new Node(1);
		Node x = new Node(2);
		Node y = new Node(3);
		Node z = new Node(4);
		
		v.next=w;
		w.next=x;
		x.next=y;
		y.next=z;
		
		System.out.println(areIdentical(a, v));
	}
}
