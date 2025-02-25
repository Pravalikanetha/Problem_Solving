package com.code.secondsprint;

public class DoubleLinkedListInsertAtP {
	static class Node
	{
	    int data;
	    Node next;
	    Node prev;
	    Node(int data)
	    {
	        this.data = data;
	        next = prev = null;
	    }
	    Node(int data, Node next)
	    {
	        this.data = data;
	        this.next = next;
	    }
	}
	public static void display(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data);
			if(temp.next!=null) {
				System.out.print("->");
			}
			temp=temp.next;
		}
	}
	static Node addNode(Node head, int p, int x) {
        Node newNode = new Node(x);
        Node temp = head;
        for (int i = 0; i < p && temp!=null; i++) {
			temp = temp.next;
		}
        newNode.next = temp.next;
        newNode.prev = temp;
        if(temp.next!=null) {
        	temp.next.prev = newNode;
        }
        temp.next = newNode;
        return head;
	}
	public static void main(String[] args) {
//		Node f = new Node(5);
//		Node e = new Node(4,f);
		Node d = new Node(4);
		Node c = new Node(3,d);
		Node b = new Node(2,c);
		Node a = new Node(1,b);
		 
		b.prev = a;
		c.prev = b;
		d.prev = c;
//		e.prev = d;
//		f.prev = e;
		
		addNode(a, 3, 44);
		display(a);
		
	}
}
