package com.designpatterns;

public class Developer {
	public static void main(String[] args) {
		Employee androidemployee = EmployeeFactory.getEmployee("Android Developer");

		int salary = androidemployee.getSalary();
		System.out.println(salary);

		Employee webemployee = EmployeeFactory.getEmployee("web Developer");

		int salary1 = webemployee.getSalary();
		System.out.println(salary1);
	}
}
