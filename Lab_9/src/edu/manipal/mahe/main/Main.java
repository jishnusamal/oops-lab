package edu.manipal.mahe.main;

import edu.manipal.mahe.department.Department;
import edu.manipal.mahe.employee.Employee;
import edu.manipal.mahe.payroll.Payroll;

public class Main {

	public static void main(String[] args) {
		Department engg = new Department("Engineering", "Mogambo Poojary", "Bengaluru");
		Employee Vansh = new Employee(2012, "Vansh", 19, 800000, engg);
		Payroll payroll = new Payroll(Vansh, engg);
		
		payroll.calculateNetSalary();
		
		payroll.generatePaySlip();

	}

}
