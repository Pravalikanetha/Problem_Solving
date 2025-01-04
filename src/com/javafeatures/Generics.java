package com.javafeatures;

public class Generics {
	
	public static void main(String[] args) {
		MyGenericClass<Integer,Integer> i = new MyGenericClass<>(1+1, 76);
		MyGenericClass<Double, String> d = new MyGenericClass<>(2143.2, "your 2143.2");
		MyGenericClass<String, Integer> s = new MyGenericClass<>("Hello", 2);
		MyGenericClass<Character, String> c = new MyGenericClass<>('c', " Hello c");
		
		
		System.out.println(i.getX()+", " + i.getY());
		System.out.println(s.getX()+", " + s.getY());
		System.out.println(d.getX()+", "+ d.getY());
		System.out.println(c.getX()+", "+ c.getY());
	}
}
