package Lab_10.src.Lab_10;

class StudentMarks {
	double totalMarks;
	int subjects;
	
	StudentMarks(double totalMarks, int subjects) {
		this.totalMarks = totalMarks;
		this.subjects = subjects;
	}
	
	double calculateAverage() throws ArithmeticException {
		double avg = 0;
		if (this.subjects == 0) {
			throw new ArithmeticException("Division by Zero Error");
		} else {
			avg = this.totalMarks/this.subjects;
		}
		return avg;
	}
}

public class marksValidationDemo {

	public static void main(String[] args) {
		StudentMarks piyushi = new StudentMarks(100, 0);
		try {
			piyushi.calculateAverage();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
