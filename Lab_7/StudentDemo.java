package Lab_7;
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
	}

	static void searchStudent(Student[] students, String subString) {
		for (Student s: students) {
			String nameWithoutWhitespace = s.removeWhitespace().toLowerCase();

			if (nameWithoutWhitespace.contains(subString.toLowerCase())) {
				System.out.print("Matching student found: ");
				System.out.println(s.sname);
			}
			System.out.println();
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
		System.out.println();
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
		this.total = sum;
		this.avg = sum/count;
	}
}

class ScienceStudent extends Student {
	double pracMarks = 0;
	
	ScienceStudent(String sname, double pracMarks) {
		super(sname);
		this.pracMarks = pracMarks;
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
		this.total = sum;
		this.avg = sum/count;
	}
	
	void displayPracticalMarks() {
		System.out.println("Practical Marks: "+this.pracMarks);
	}	
}

class ArtStudent extends Student {
	String electiveSubject = "";
	
	ArtStudent(String sname, String elecSub) {
		super(sname);
		this.electiveSubject = elecSub;
	}
	
	void display() {
		super.display();
		System.out.println("Elective Subject: "+this.electiveSubject);
	}
}

public class StudentDemo {

	public static void main(String[] args) {
		ScienceStudent Gyanu = new ScienceStudent("Gyanu Kumar", 92);
		Gyanu.addSubjects("OOPS", 85.0, 0);
		Gyanu.compute();
		Gyanu.display();
		Gyanu.displayPracticalMarks();
		System.out.println();
		
		ArtStudent Tanay = new ArtStudent("Tanay", "Psychology");
		Tanay.addSubjects("History", 90.0, 0);
		Tanay.compute();
		Tanay.display();
	}

}