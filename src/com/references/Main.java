package com.references;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.references.entity.Employee;
import com.references.utility.CustomComparator;
import com.references.utility.GeneratorUtil;

public class Main {
	public static void main(String[] args) {
		List<Employee> employeList = GeneratorUtil.populateEmployees();
		System.out.println("Sort by name");
		Collections.sort(employeList, (Employee o1, Employee o2) -> {
			return CustomComparator.compareByName(o1, o2);
		});
		for (Employee employees : employeList) {
			System.out.println(employees);
		}

		System.out.println();
		System.out.println("Sort by marks");
		Collections.sort(employeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return CustomComparator.compareByMarks(o1, o2);
			}
		});
		
//		Collections.sort(employeList, (Employee o1, Employee o2) -> CustomComparator.compareByMarks(o1, o2));
		Collections.sort(employeList, CustomComparator::compareByMarks);
		for (Employee employee : employeList) {
			System.out.println(employee);
		}
	}
}
