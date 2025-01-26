package com.code.secondsprint;
class Animal{
	String name;
	Animal(){}
	Animal(String name){
		this.name=name;
	}
	void eat(){
		System.out.println("Animal eats");
	}
}
class Dog extends Animal{
	Dog(String name){
		super.name = name;
	}
	void display() {
		System.out.println(super.name);
	}
}
public class EncapsulationMain {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "parent";
		a.eat();
		Dog dog = new Dog("koel");
		dog.eat();
		dog.display();
	}
}
