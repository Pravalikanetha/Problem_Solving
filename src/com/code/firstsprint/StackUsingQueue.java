package com.code.firstsprint;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	public static class MyStackQueue {
		Queue<Integer> q;
	    public MyStackQueue() {
	    	this.q = new LinkedList<>();
	    }
	    
	    public void push(int x) {
	        int s = q.size();
	        q.add(x);
	        for (int i = 0; i < s; i++) {
	        	q.add(q.peek());
	        	q.poll();
	        }
	        System.out.println(q);
	    }
	    
	    public int pop() {
	        return q.poll();
	    }
	    
	    public int top() {
	       return q.peek();
	    }
	    
	    public boolean empty() {
	      return q.isEmpty();
	    }
	    
	}
	public static void main(String[] args) {
		MyStackQueue st = new MyStackQueue();
		st.push(0);
		st.push(1);
		st.push(3);
		st.push(6);
		System.out.println(st.top());
		System.out.println(st.pop());
		System.out.println(st.top());
	}
}
