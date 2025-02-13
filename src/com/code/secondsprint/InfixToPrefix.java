package com.code.secondsprint;

public class InfixToPrefix {
	public static String swap(String st) {
		StringBuilder sb = new StringBuilder(st);
		int  i = 0 ;
		int  j = st.length()-1;
		while(i<=j) {
			char temp = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, temp);
			i++;
			j--;
		}
		i = 0 ;
		while(i<st.length()) {
			if (sb.charAt(i) == '(') {
	            sb.setCharAt(i, ')');
	        } else if (sb.charAt(i) == ')') {
	            sb.setCharAt(i, '(');
	        }
			i++;
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String s = "((A-(B/C))*((A/K)-L))";
		swap(s);
		System.out.println(swap(s));
	}
}
