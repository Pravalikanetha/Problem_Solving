package com.code.firstsprint;


class StackImplWithLinkedList {
	static class StackNode {
		int data;
		StackNode next;
		StackNode(int a) {
			data = a;
			next = null;
		}
	}
	public static class MyStack {
		StackNode top;
		public MyStack() {
			this.top = null;
		}
		
		void push(int a) {
			StackNode node = new StackNode(a);
			node.next = top;
			top = node;

		}

		int pop() {
			if(top==null) return -1;
			int popped = top.data;
			top=top.next;
			return popped;
		}
		int peek() {
			if(top==null) return -1;
			return top.data;
		}
	}
	public static void main(String[] args) {
		MyStack st = new MyStack();
		st.push(1);
		st.push(2);
		System.out.println("before popping->"+st.peek());
		System.out.println("popped->"+st.pop());
		System.out.println("after popping->"+st.peek());
	}

}
