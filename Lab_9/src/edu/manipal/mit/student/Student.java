package edu.manipal.mit.student;

import edu.manipal.mit.course.Course;

public class Student {
	private String name;
	private int rollNum;
	protected String dept;
	public double gpa;
	public Course course;
	
	public Student(String name, int rollNum, String dept, double gpa) {
		this.name = name;
		this.rollNum = rollNum;
		this.dept = dept;
		this.gpa = gpa;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public String getName() {
		return this.name;
	}
}
