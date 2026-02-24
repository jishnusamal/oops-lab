package Lab_4;

class Student {
	String sname;
	double[] marksArray = new double[10];
	double total, avg;
	
	Student() {
		this.sname = "";
		this.marksArray = new double[] {0, 0, 0, 0, 0};
	}
	
	Student(String sname, double[] marksArray) {
		this.sname = sname;
		this.marksArray = marksArray;
	}
	
	void display() {
		System.out.println("Name: "+this.sname);
		System.out.println("Total Marks: "+this.total);
		System.out.println("Average: "+this.avg);
	}
	
	void compute() {
		float sum = 0;
		for (double m: this.marksArray) {
			sum += m;
		}
		float average = sum/this.marksArray.length;

		this.total = sum;
		this.avg = average;
	}
}

public class StudentDemo {

	public static void main(String[] args) {
		System.out.println("Hello");
		String sname = "GK";
		double[] marksArray = {93, 94, 92, 97, 94};
		Student Gyanu = new Student(sname, marksArray);
		Gyanu.compute();
		Gyanu.display();
		

	}

}
