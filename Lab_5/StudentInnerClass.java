package Lab_5;

class Student {
	String sname;
	double total, avg;
	Subject[] subjects = new Subject[10];
	
	Student(String sname) {
		this.sname = sname;
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
	
	void addSubject(String name, double marks, int index) {
		Subject s = new Subject();
		s.name = name;
		s.assignMarks(marks);
		this.subjects[index] = s;
	}
	
	void display() {
		System.out.println("Name: "+this.sname);
		System.out.println("Total Marks: "+this.total);
		System.out.println("Average: "+this.avg);
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

public class StudentInnerClass {

	public static void main(String[] args) {
		String sname = "GK";
		Student Gyanu = new Student(sname);
		Gyanu.addSubject("OOPS", 85.0, 0);
		Gyanu.addSubject("APE", 90.0, 1);
			
		Gyanu.compute();
		Gyanu.display();
	}

}
