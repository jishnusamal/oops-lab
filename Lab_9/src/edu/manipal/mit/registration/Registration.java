package edu.manipal.mit.registration;
import edu.manipal.mit.course.Course;
import edu.manipal.mit.student.Student;

public class Registration {
	private Student s;
	private Course c;
	
	public Registration(Student s, Course c) {
		this.s = s;
		this.c = c;
	}
	
	public void registerStudent() {
		s.setCourse(c);
	}
	
	public void getReg() {
		System.out.println("Student: "+this.s.getName() + " \nCourse: " + this.c.getCourseName());
	}
}