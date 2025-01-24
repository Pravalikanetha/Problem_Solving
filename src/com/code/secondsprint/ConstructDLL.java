package com.code.secondsprint;

public class ConstructDLL {
	public static class Node {
		int val;
		Node next;
		Node prev;
		Node(int val,Node next,Node prev){
			this.val=val;
			next = null;
			prev = null;
		}
		Node(int val){
			this.val=val;
			next = null;
			prev = null;
		}
	}
	static Node constructDLL(int arr[]) {
		Node head = new Node(arr[0]);
		Node previous = head;
		for (int i = 1; i < arr.length; i++) {
			Node temp = new Node(arr[i]);
			temp.prev = previous;
			previous.next = temp;
			previous = temp;
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
		int[] arr = {1,2,3,4,5};
		Node ans = constructDLL(arr);
		display(ans);
	}

}
