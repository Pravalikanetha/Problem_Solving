package com.codeSprint;

public class QueueImplWithLinkedList {
	static class QueueNode
	{
		int data;
		QueueNode next;
		QueueNode(int a)
		{
			data = a;
			next = null;
		}
	}
	static class Queue
	{
		QueueNode front, rear;
		public Queue() {
			this.front = null;
			this.rear = null;
		}
		void push(int a)
		{
			QueueNode temp = new QueueNode(a);
			if(front==null){
				front=rear=temp;
			}else{
				rear.next=temp;
				rear = temp;
			} 
		}

		int pop()
		{
			if (front == null) { 
				return -1; 
			}
			int temp = front.data;
			front = front.next;
			return temp;
		}

		int peek(){
			int peek = rear.data;
			return peek;
		}

		void display() {
			QueueNode temp = front;
			while(temp!=null) {
				System.out.print(temp.data);
				if(temp.next!=null) {
					System.out.print("->");
				}
				temp=temp.next;
			}
		}
	}
	public static void main(String[] args) {
		Queue q = new Queue();
		q.push(1);
		q.push(4);
		q.push(2);
		q.push(3);
		q.push(5);
		System.out.println("before popping->"+q.peek());
		System.out.println("popped->"+q.pop());
		System.out.println("after popping->"+q.peek());
		q.display();
		System.out.println();
		System.out.println("popped->"+q.pop());
		System.out.println("popped->"+q.pop());
		System.out.println("popped->"+q.pop());
		System.out.println("popped->"+q.pop());
		System.out.println("popped->"+q.pop());
	}
}
