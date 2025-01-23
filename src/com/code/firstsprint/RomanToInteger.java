package com.code.firstsprint;

public class RomanToInteger {
	public static int value(char c) {
		if(c == 'I') {
			return 1;
		}
		if(c == 'V') {	
			return 5;
		}
		if(c == 'X') {
			return 10;
		}
		if(c == 'L') {
			return 50;
		}
		if(c == 'C') {
			return 100;
		}
		if(c == 'D') {
			return 500;
		}
		if(c == 'M') {
			return 1000;
		}else{
			return -1;
		}
	}
	public static int romanToInt(String s) {
		int sum = 0 ;
		int n = s.length();
		for (int i = 0; i < n; i++) {
			int ch = value(s.charAt(i));
			if(i+1<n) {
				System.out.println("hello");
				int ch1 = value(s.charAt(i+1));
				if(ch>=ch1) {
					sum+=ch;
				}else {
					sum += (ch1-ch);
					i++;
				}
			}
			else {
				sum += ch;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(romanToInt("CD"));
	}
}
