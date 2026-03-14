package lab7;

class Employee {
	String ename = "", email = "";
	int eid = 0;
	double basic = 0, da = 0, gross = 0, net = 0;
	Department[] departments = { 
		new Department("Engineering", "BLR"), 
		new Department("Sales", "BLR"),
	};
	Department dept = departments[0];
	
	Employee(int eid, String ename, double basic) {
		this.ename = this.formatEmployeeName(ename);
		this.email = this.generateEmail();
		this.eid = eid;
		this.basic = basic;
	}
	
	class Department {
		String deptName, loc;
		
		Department(String deptName, String loc) {
			this.deptName = deptName;
			this.loc = loc;
		}
	}
	
	void addDepartments(int index, String dept, String loc) {
		for (int i = 0; i < index; i++) {
			this.departments[this.departments.length+i] = new Department(dept, loc);
		}
	}
	
	String formatEmployeeName(String ename) {
		String name = ename.toLowerCase();
		String formattedName = "";
		String[] nameArray = name.split(" ");
		for (String s: nameArray) {
			formattedName += s.replace(s.charAt(0), s.toUpperCase().charAt(0)) + " ";
		}
		return formattedName;
	}
	
	String generateEmail() {
		return this.ename.toLowerCase().trim().replace(" ", ".") + "@example.com";
	}
	
	double calculateSalary() {
		this.da = 0.52 * basic;
		this.gross = this.basic + this.da;
		this.net = this.gross*0.7;
		return this.net;
	}
	
	void display() {
		System.out.println("Employee ID: "+this.eid);
		System.out.println("Name: "+this.ename);
		System.out.println("Email: "+this.email);
		System.out.println("Net Salary: "+this.net);
		System.out.println("Department: " + this.dept.deptName + ", "+ this.dept.loc);
	}
}

class PartTimeEmp extends Employee {
	int hoursWorked = 0;
	static double hourlyRate = 200;
	
	PartTimeEmp(int eid, String ename, double basic, int hoursWorked) {
		super(eid, ename, basic);
		this.hoursWorked = hoursWorked;
	}
	
	double calculateSalary() {
		super.calculateSalary();
		return this.net + this.hoursWorked*PartTimeEmp.hourlyRate;
	}
	
	void display() {
		super.display();
		System.out.println("Salary: "+this.calculateSalary());
	}
}

class FullTimeEmp extends Employee {
	double bonus = 0, deductions = 0;
	
	FullTimeEmp(int eid, String ename, double basic, double bonus, double deductions) {
		super(eid, ename, basic);
		this.bonus = bonus;
		this.deductions = deductions;
	}
	
	double calculateSalary() {
		super.calculateSalary();
		return this.net + this.bonus + this.deductions;
	}
	
	void display() {
		super.display();
		System.out.println("Salary: "+this.calculateSalary());
	}
}

public class EmployeeDemo {
	public static void main(String[] args) {
		FullTimeEmp Vansh = new FullTimeEmp(3012, "VaNSh RAstOgI", 790000, 80000, 150000);
		Vansh.calculateSalary();
		Vansh.display();
	}

}