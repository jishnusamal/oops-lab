package Lab_10.src.Lab_10;

class CourseFullException extends Exception {
	private static final long serialVersionUID = 1L;

	public CourseFullException(String message) {
		super(message);
	}
}

class Course {
	private String courseName;
	private int capacity;
	private int enrolledStudents;
	
	Course(String courseName, int capacity, int enrolledStudents) {
		this.courseName = courseName;
		this.capacity = capacity;
		this.enrolledStudents = enrolledStudents;
	}
	
	void enrollStudent() throws CourseFullException {
		if (enrolledStudents >= capacity) {
			throw new CourseFullException("Course is full.");
		} else {
			enrolledStudents++;
		}
	}
}

public class courseCapacityDemo {

	public static void main(String[] args) {
		Course oops = new Course("OOPS", 10, 10);
		try {
			oops.enrollStudent();
		} catch (CourseFullException e) {
			System.out.println(e.getMessage());
		}

	}

}

//Write a program to manage course enrollment. If a course exceeds its capacity, throw a 
//custom checked exception called CourseFullException. Create a Course class with 
//private attributes courseName, capacity, and enrolledStudents. A method enrollStudent() 
//that throws CourseFullException if the course is already full. Create a custom checked 
//exception CourseFullException. Write a CourseCapacityDemo class to enroll students in 
//a course, Handle the CourseFullException when the course is full. 