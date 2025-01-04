package com.designpatterns;

public class WebDeveloper implements Employee {

	@Override
	public int getSalary() {
		System.out.println("Returning Web Developer salary");
		return 900000;
	}

}
