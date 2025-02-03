package com.references.utility;

import java.util.ArrayList;
import java.util.List;

import com.references.entity.Employee;

public class GeneratorUtil {
	public static List<Employee> populateEmployees(){
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101,"Pravalika", 60));
		employeeList.add(new Employee(176,"Lucky", 55));
		employeeList.add(new Employee(143,"Alice", 30));
		employeeList.add(new Employee(107,"John", 60));
		employeeList.add(new Employee(165,"Bob", 90));
		employeeList.add(new Employee(131,"Robert", 20));
		return employeeList;
	}
}
