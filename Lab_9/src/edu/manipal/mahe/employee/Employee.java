package edu.manipal.mahe.employee;

import edu.manipal.mahe.department.Department;

public class Employee {
	private int eid;
	private String name;
	protected int age;
	public Department dept;

	public double basicSalary;

	public Employee(int eid, String name, int age, double salary, Department dept) {
		this.eid = eid;
		this.name = name;
		this.age = age;
		this.basicSalary = salary;
		this.dept = dept;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}