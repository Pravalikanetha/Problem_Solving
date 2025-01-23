package com.code.firstsprint;

import java.util.Stack;

public class QueueUsingStack {
	public static class MyQueueStack {
		Stack<Integer> st1;
		Stack<Integer> st2;
	    public MyQueueStack() {
	    	this.st1 = new Stack<>();
	    	this.st2 = new Stack<>();
	    }
	    
	    public void push1(int x) { //time complexity 2n
	        int s1 = st1.size();
	        for (int i = 0; i < s1; i++) {
				int pop = st1.pop();
				st2.add(pop);
			}
	        st1.add(x);
	        int s2 = st2.size();
	        for (int i = 0; i < s2; i++) {
				int pop = st2.pop();
				st1.add(pop);
			}
	        System.out.println(st1);
	    }
	    
	    public void push(int x) { 
	        st1.add(x);
	    }
	    
	    public int pop() {
	    	if(st2.isEmpty()) {
	    		int s1 = st1.size();
		        for (int i = 0; i < s1; i++) {
					int pop = st1.pop();
					st2.add(pop);
				}
	    	}
	    	return st2.pop();
	    }
	    
	    public int top() {
	       if(st2.isEmpty()) {
	    	   int s1 = st1.size();
		        for (int i = 0; i < s1; i++) {
					st2.add(st1.peek());
					st1.pop();
				}
	       }
	       return st2.peek(); 
	    }
	    
	    public boolean empty() {
	      return st2.isEmpty() && st1.isEmpty();
	    }
	    
	}
	public static void main(String[] args) {
		MyQueueStack st = new MyQueueStack();
//		st.push(0);
//		st.push(1);
//		st.push(3);
//		st.push(6);
//		System.out.println(st.top());
		System.out.println(st.empty());
		int[] i = new int[5];
		i[0] = 1;
		System.out.println(i[0]);
	}
}
