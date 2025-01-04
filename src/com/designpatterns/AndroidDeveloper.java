package com.designpatterns;

public class AndroidDeveloper implements Employee {

	@Override
	public int getSalary() {
		System.out.println("Returning Android Developer Salary");
		return 700000;
	}

}
