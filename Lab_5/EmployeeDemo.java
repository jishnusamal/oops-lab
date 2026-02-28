package Lab_5;

class Employee {
	String ename;
	int eid;
	double basic, da, gross, net;
	Department dept;
	Department[] departments = { 
		new Department("Engineering", "BLR"), 
		new Department("Sales", "BLR"),
	};
	
	Employee(int eid, String ename, double basic) {
		this.ename = ename;
		this.eid = eid;
		this.basic = basic;
		this.da = 0.52 * basic;
		this.gross = this.basic + this.da;
		this.dept = departments[0];
	}
	
	class Department {
		String departmentName, location;
		
		Department(String departmentName, String location) {
			this.departmentName = departmentName;
			this.location = location;
		}
	}
	
	void addDepartments(String department, String location, int index) {
		for (int i = 0; i < index; i++) {
			this.departments[this.departments.length+i] = new Department(department, location);
		}
		
	}
	
	void display() {
		System.out.println("Employee ID: "+this.eid);
		System.out.println("Name: "+this.ename);
		System.out.println("Net Salary: "+this.net);
		System.out.println("Department: " + this.dept.departmentName + ", "+ this.dept.location);
	}
	
	void compute_net_sal() {
		this.net = this.gross*0.7;
	}
}

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee Vansh = new Employee(3012, "Vansh Rastogi", 790000);
		Vansh.compute_net_sal();
		Vansh.display();
	}

}
