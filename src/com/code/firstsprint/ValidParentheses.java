package com.code.firstsprint;

import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String s) {
		Stack<Character> st = new Stack<>();
		for (char c : s.toCharArray()) {
			if(c == '(' || c == '{' || c == '[') {
				st.push(c);
			}
			else if(c == ')' && !st.isEmpty() && st.peek() == '(') {
				st.pop();
			}
			else if(c == '}' && !st.isEmpty() && st.peek() == '{') {
				st.pop();
			}
			else if(c == ']' && !st.isEmpty() && st.peek() == '[') {
				st.pop();
			}
		}

		return st.isEmpty();
	}
	
	public static void main(String[] args) {
		String s = "()[{[}]";
		System.out.println(isValid(s));
	}
}
