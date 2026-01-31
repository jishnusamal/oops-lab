public class Salary {

	public static void main(String[] args) {
		float hoursWorked = 45, hourlyRate = 200, salary = 0, ovh = 0;
		
		System.out.println("©️ Jishnu Samal 2026");
		
		if (hoursWorked <= 40) {
			salary = hoursWorked * hourlyRate;
		} else {
			ovh = hoursWorked - 40;
			salary = (40 * hourlyRate) + (ovh*(hourlyRate/2));
		}
		System.out.println("Work Hours: " + hoursWorked + "\n" + "Overhours: " + ovh + "\n" + "Salary: " + salary);
	}

}