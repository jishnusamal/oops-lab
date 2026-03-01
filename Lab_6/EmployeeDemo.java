package Lab_6;

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
		this.ename = this.formatEmployeeName();
		this.eid = eid;
		this.basic = basic;
		this.da = 0.52 * basic;
		this.gross = this.basic + this.da;
		this.email = this.generateEmail();
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
	
	String formatEmployeeName() {
		String name = this.ename.toLowerCase();
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
	
	void display() {
		System.out.println("Employee ID: "+this.eid);
		System.out.println("Name: "+this.ename);
		System.out.println("Email: "+this.email);
		System.out.println("Net Salary: "+this.net);
		System.out.println("Department: " + this.dept.deptName + ", "+ this.dept.loc);
	}
	
	void compute_net_sal() {
		this.net = this.gross*0.7;
	}
}

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee Vansh = new Employee(3012, "VaNSh RAstOgI", 790000);
		Vansh.compute_net_sal();
		Vansh.display();
	}

}
