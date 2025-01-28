package com.code.secondsprint;

public class RemoveNodesFromGreaterRightSide {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int val){
			this.val=val;
		}
	}
	public static void removeNodes(ListNode head) {
		ListNode temp = head;
		int length = 0;
		while(temp != null) {
			temp= temp.next;
			length++;
		}

		int[] arr = new int[length];
        int i = 0;
        temp = head;
        while(temp != null) {
        	arr[i++] = temp.val;
			temp= temp.next;
		}
        int max = 0;
        for (int j = 0; j < arr.length; j++) {
			max = Math.max(max, arr[j]);
		}
	}
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);   //7,9,6,6,7,8,3,0,9,5

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		removeNodes(a);
	}
}
