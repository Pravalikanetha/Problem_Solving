package com.codeSprint;

import java.util.HashMap;

public class FindTheLengthOfLoop {
	public static class Node {
		int val;
		Node next;
		Node(int val){
			this.val=val;
			next = null;
		}
	}
	public static int countNodesinLoop(Node head) {
        Node temp = head;
        HashMap<Node, Integer> hm = new HashMap<>();
        int  i = 1;
        while(temp!=null) {
        	if(!hm.containsKey(temp)) {
        		hm.put(temp, i);
        	}else if(hm.containsKey(temp)) {
        		int ans = hm.get(temp);
        		return i-ans;
        	}
        	temp=temp.next;
        	i++;
        }
        return 0;
    }
	public static int NodesinLoop(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				System.out.println(rotate(slow, fast));
				return rotate(slow, fast);
			}
		}
		
		return 0;
	}
	public static int rotate(Node slow, Node fast) {
		int count = 1;
		fast=fast.next;
		while(slow!=fast) {
			count++;
			fast=fast.next;
		}
		return count;
	}
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(8);
		Node c = new Node(7);
		Node d = new Node(3);
		Node e = new Node(4);
		Node f = new Node(5);

		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		f.next=b;
		
		System.out.println(countNodesinLoop(a));
	}
}
