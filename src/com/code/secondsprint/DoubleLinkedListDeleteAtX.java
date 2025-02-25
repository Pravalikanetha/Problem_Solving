package com.code.secondsprint;

public class DoubleLinkedListDeleteAtX {
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
	public static Node deleteNode1(Node head, int x) {
		if(x == 1) {
			head = head.next;
			if(head!=null) {
				head.prev = null;
			}
			return head;
		}
		Node temp = head;
		for (int i = 1; i < x-1 && temp!=null; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		if(temp.next!=null) {
			temp.next.prev = temp;
		}
		return head;
	}
	public static Node deleteNode(Node head, int x) {
        if (head == null) return null; // If list is empty, return null

        // Case 1: Deleting the first node
        if (x == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }

        // Case 2: Deleting a node other than the first
        Node temp = head;
        for (int i = 1; i < x && temp != null; i++) {
            temp = temp.next;
        }
        System.out.println();
        // If position is invalid
        if (temp == null) return head;

        // Update pointers to remove temp node
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        return head;
    }
	public static void main(String[] args) {
		Node d = new Node(4);
		Node c = new Node(3,d);
		Node b = new Node(2,c);
		Node a = new Node(1,b);
		 
		b.prev = a;
		c.prev = b;
		d.prev = c;
		
		Node ans = deleteNode1(a, 4);
		display(ans);
	}
}
