package com.code.secondsprint;

public class Employee {
private int id;
private String name;
private double salary;
public int getId() {
	return id;
}
public void setId(int id) {
	if(id>0) {
	this.id = id;
	}else {
		throw new IllegalArgumentException("Should be greater then 0");
	}
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}
