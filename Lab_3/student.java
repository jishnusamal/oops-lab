package lab3;

class studentData {
	String sname;
	float[] marksArray = new float[10];
	float total, avg;
	
	void assign(String name, float[] marks) {
		this.sname = name;
		this.marksArray = marks;
	}
	
	void display() {
		System.out.println("Name: "+this.sname);
		System.out.println("Total Marks: "+this.total);
		System.out.println("Average: "+this.avg);
	}
	
	void compute() {
		float sum = 0;
		for (float m: this.marksArray) {
			sum += m;
		}
		float average = sum/this.marksArray.length;

		this.total = sum;
		this.avg = average;
	}
}

public class student {

	public static void main(String[] args) {
		studentData Gyanu = new studentData();
		String sname = "GK";
		float[] marksArray = {93, 94, 92, 97, 94};
		Gyanu.assign(sname, marksArray);
		
		Gyanu.compute();
		
		Gyanu.display();
	}

}
