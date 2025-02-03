package com.references.utility;

import com.references.entity.Employee;

public class CustomComparator {
	
	public static int compareByName(Employee e1, Employee e2) {
	    return e1.getName().compareTo(e2.getName());
	}
	
	public static int compareByMarks(Employee e1, Employee e2) {
	    return e1.getMarks() - e2.getMarks();
	}
}
