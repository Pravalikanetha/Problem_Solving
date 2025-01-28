package com.code.secondsprint;

public class SwapNodesInLinkedList {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int val){
			this.val=val;
		}
	}
	public static void display(ListNode head) {
		ListNode temp = head;
		while(temp!=null) {
			System.out.print(temp.val);
			if(temp.next!=null) {
				System.out.print("->");
			}
			temp=temp.next;
		}
	}
	public static ListNode swapNodes(ListNode head, int k) {
		if(head.next == null) {
			return head;
		}
		ListNode temp = head;
		int length = 0;
		while(temp != null) {
			temp= temp.next;
			length++;
		}
		if(length<k) {
			return head;
		}
        int[] arr = new int[length];
        int i = 0;
        temp = head;
        while(temp != null) {
        	arr[i++] = temp.val;
			temp= temp.next;
		}
        
        int num = arr[k-1];
        arr[k-1] = arr[arr.length-k];
        arr[arr.length-k] = num;
        
        temp = head;
        for (int j = 0; j < arr.length; j++) {
        	if(temp!=null) {
        		temp.val = arr[j];
        		temp = temp.next;
        	}
        }
        return head;
    }
	public static ListNode swap(ListNode head, int k) { //optimal
		ListNode ptr = head;
		while(--k > 0) {
			System.out.println(ptr.val +" "+k);
			ptr = ptr.next;
			System.out.println(ptr.val +" "+k);
		}
		System.out.println(ptr.val);
		ListNode p1 = head;
		ListNode p2 = ptr;
		while(p2.next!=null) {
			p2=p2.next;
			p1=p1.next;
		}
		int num = ptr.val;
		ptr.val=p1.val;
		p1.val = num;
		
		return head;
	}
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);   //7,9,6,6,7,8,3,0,9,5
		ListNode f = new ListNode(8);
		ListNode g = new ListNode(3);
		ListNode h = new ListNode(0);
		ListNode i = new ListNode(9);
		ListNode j = new ListNode(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next=f;
		f.next=g;
		g.next=h;
		h.next=i;
		i.next=j;
		ListNode ans1 = swap(a, 2);
		display(ans1);
	}
}
