package com.codesprint;

class MyStackimpl {
	private int[] arr;
	private int top;
	
	public MyStackimpl() {
		arr = new int[1000];
		top = -1;
	}
	
	public void push(int x) {
		top = top + 1;
		arr[top] = x;
	}
	
	public int pop() {
		top= top-1;
		return arr[top];
	}
	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.println(arr[i]);
		}
	}
}
public class StackImplementation {
	public static void main(String[] args) {
		MyStackimpl st = new MyStackimpl();
		st.push(1);
		st.push(2);
		st.push(1);
		st.push(3);
		st.push(2);
		st.push(1);
		st.push(4);
		st.push(2);
		st.pop();
		st.display();
	}
}
//1 2 1 3 2 1 4 2