package edu.manipal.mit.main;
import edu.manipal.mit.course.Course;
import edu.manipal.mit.registration.Registration;
import edu.manipal.mit.student.Student;

public class Main {
	public static void main(String[] args) {
		Student gyanu = new Student("Gyanu", 7, "CSE", 10);
		Course oops = new Course("Object Oriented Programming", "Ms. Tulika Dutta", 3); 
		Registration reg = new Registration(gyanu, oops);
		reg.registerStudent();
		reg.getReg();
	}
}

//Main Class: Should be inside the edu.manipal.mit.main package 
//Test the application by creating student , course  and registration objects and registering the 
//student to the course.