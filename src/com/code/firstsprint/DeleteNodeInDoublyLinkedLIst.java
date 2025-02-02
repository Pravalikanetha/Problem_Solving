package com.code.firstsprint;

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
		
		Node ans = deleteTail(a);
		display(ans);
	}
}
