package com.code.secondsprint;

public class InnerClass {
	static class ChaiShop{
		String branch = "Boom";
		class Thikka{
			String evariki = "nake";
			private void inner() {
				System.out.println("Inner Class method");
			}
		}
		private void display() {
			System.out.println("This is outside class");
		}
	}
	public static void main(String[] args) {
		ChaiShop branch1 = new ChaiShop();
		System.out.println(branch1.branch);
		ChaiShop.Thikka th = branch1.new Thikka();
		System.out.println(th.evariki);
		th.inner();
		branch1.display();
	}
}
