package Lab_6;
import java.util.Scanner;
import java.util.Arrays;

class Student {
	String sname = "", initials = "";
	double total, avg;
	Subject[] subjects = new Subject[10];
	
	Student(String sname) {
		this.sname = sname;
		this.extractInitials();
	}
	
	class Subject {
		String name;
	    double marks;
	    
	    void assignMarks(double marks) {
	    	this.marks = marks;
	    }
	    
	    void displaySubjectDetails() {
	    	System.out.println("Subject Name: "+this.name);
	    	System.out.println("Marks: "+this.marks);
	    }
	}
	
	void addSubjects(String name, double marks, int index) {
		Subject s = new Subject();
		s.name = name;
		s.assignMarks(marks);
		this.subjects[index] = s;
	}

	void extractInitials() {
		String[] nameArray = this.sname.split(" ");
		String initials = "";
		for (String s: nameArray) {
			initials += s.charAt(0);
		}
		this.initials = initials;
	}

	String removeWhitespace() {
	    return this.sname.replaceAll(" ", "");
	}
	
	void display() {
		System.out.println("Name: "+this.sname);
		System.out.println("Initials: "+this.initials);
		System.out.println("Name without whitespace: "+ this.removeWhitespace());
		System.out.println("Total Marks: "+this.total);
		System.out.println("Average: "+this.avg);
		System.out.println("\n");
	}

	static void searchStudent(Student[] students, String subString) {
		for (Student s: students) {
			String nameWithoutWhitespace = s.removeWhitespace().toLowerCase();

			if (nameWithoutWhitespace.contains(subString.toLowerCase())) {
				System.out.println("Matching student found: ");
				System.out.println("Name: "+s.sname);
			}
			System.out.println("\n");
		}
	}

	static void sortStudents(Student[] students) {
		String studentNames[] = new String[students.length];
		for (int i = 0; i < students.length; i++) {
			studentNames[i] = students[i].sname;
		}
		Arrays.sort(studentNames);

		System.out.println("Sorted student names: ");
		for (String name: studentNames) {
			System.out.println(name);
		}
		System.out.println("\n");
	}
	
	void compute() {
		double sum = 0;
		int count = 0;
		for (Subject s: this.subjects) {
			if (s != null) {
				sum += s.marks; 
				count++; 
			}
		}
		
		double average = sum/count;

		this.total = sum;
		this.avg = average;
	}
}

public class StudentDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String sname = "Gyanu Kumar";
		Student Gyanu = new Student(sname);
		Gyanu.addSubjects("OOPS", 85.0, 0);
		Gyanu.addSubjects("APE", 90.0, 1);

		Student Vansh = new Student("Vansh Rastogi");
		Vansh.addSubjects("OOPS", 90.0, 0);
		Vansh.addSubjects("APE", 95.0, 1);

		Student[] students = {Vansh, Gyanu};
		System.out.print("Enter substring to search: ");
		String subString = s.nextLine();
		Student.searchStudent(students, subString);

		Student.sortStudents(students);

		Gyanu.compute();
		Gyanu.display();
		Vansh.compute();
		Vansh.display();
		s.close();
	}

}
