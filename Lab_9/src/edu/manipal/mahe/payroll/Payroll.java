package edu.manipal.mahe.payroll;
import edu.manipal.mahe.department.Department;
import edu.manipal.mahe.employee.Employee;

public class Payroll {
	Employee e;
	Department d;
	
	public Payroll(Employee e, Department d) {
		this.e = e;
		this.d = d;
	}
	
	public double calculateNetSalary() {
		double gross = 1.52*e.basicSalary;
		double net = 0.7*gross;
		return net;
	}
	
	public void generatePaySlip() {
		System.out.println("Name: "+e.getName()+ "\nAge: "+e.getAge()+"\nDepartment: "+ e.dept.getName() + "\nNet Salary: " + calculateNetSalary());
	}

}

//Attributes:  
//employee (Employee, private): Employee object 
//department (Department, private): Department object 
//Methods:  
//• calculateNetSalary() (private): Calculates an employee's net salary as per following 
//calculation. 
//DA = 52% of Basic Salary,  Gross Salary= Basic Salary + DA, IT = 30% of the 
//Gross Salary, Net Salary = (Gross Salary – IT) 
//• generatePaySlip() (public): Generates an employee's pay slip showing following 
//output ( for basic salary of 50000.0 ) 
//Payslip for January 2025 
//Employee name: Arun 
//Employee age: 53200.0 
//Employee department name: IT Department 
//Employee Net Salary : 53200.0 