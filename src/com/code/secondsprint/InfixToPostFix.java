package com.code.secondsprint;

import java.util.Stack;

public class InfixToPostFix {
	public static int priority(char c) {
	    switch (c) {
	        case '+':
	        case '-':
	            return 1;
	        case '*':
	        case '/':
	            return 2;
	        case '^':
	            return 3;
	        default:
	            return 0;
	    }
	}
	public static String infixToPostfix(String s) {
		StringBuilder ans = new StringBuilder();
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
				ans.append(c);
			}else if(c == '(') {
				st.push(c);
			}else if(c == ')') {
				while(!st.isEmpty() && st.peek() != '(') {
					ans.append(st.pop());
				}
				if (!st.isEmpty() && st.peek().equals('(')) {
				    st.pop();
				}
			}else {
				while(!st.isEmpty() && priority(c) <= priority(st.peek())) {
					ans.append(st.peek());
					st.pop();
				}
				st.push(c);
			}
		}
		while(!st.isEmpty()) {
			ans.append(st.peek());
			st.pop();
		}
		return ans.toString();
	}
	public String Postfix(String s) {
	    StringBuilder ans = new StringBuilder();
	    Stack<Character> st = new Stack<>();

	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);

	        // If the character is an operand (letter or digit), append it to the result
	        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
	            ans.append(c);
	        } 
	        // If the character is '(', push it onto the stack
	        else if (c == '(') {
	            st.push(c);
	        } 
	        // If the character is ')', pop from stack until '(' is encountered
	        else if (c == ')') {
	            while (!st.isEmpty() && st.peek() != '(') {
	                ans.append(st.pop());
	            }
	            if (!st.isEmpty() && st.peek() == '(') {
	                st.pop(); // Remove '(' from the stack
	            }
	        } 
	        // If the character is an operator
	        else {
	            while (!st.isEmpty() && priority(c) <= priority(st.peek())) {
	                ans.append(st.pop());
	            }
	            st.push(c); // Push the current operator onto the stack
	        }
	    }

	    // Pop any remaining operators in the stack
	    while (!st.isEmpty()) {
	        ans.append(st.pop());
	    }

	    return ans.toString();
	}
	public static void main(String[] args) {
		String s = "a+b*(c^d-e)^(f+g*h)-i"; //abcd^e-fgh*+^*+i-
		
		System.out.println(infixToPostfix(s));
	}
}
