package Lab_6;
import java.util.Scanner;

class Employee {
	String ename = "", email = "";
	int eid = 0;
	double basic = 0, da = 0, gross = 0, net = 0;
	Department[] departments = { 
		new Department("Engineering", "BLR"), 
		new Department("Sales", "BLR"), 
		new Department("Marketing", "BLR"), 
		new Department("HR", "BLR") 
	};
	Department dept = departments[0];
	
	Employee(int eid, String ename, double basic) {
		this.ename = this.formatEmployeeName(ename);
		this.eid = eid;
		this.basic = basic;
		this.da = 0.52 * basic;
		this.gross = this.basic + this.da;
		this.generateEmail();
	}
	
	class Department {
		String departmentName, location;
		
		Department(String departmentName, String location) {
			this.departmentName = departmentName;
			this.location = location;
		}
	}
	
	void addDepartments(int index, String department, String location) {
		for (int i = 0; i < index; i++) {
			this.departments[this.departments.length+i] = new Department(department, location);
		}
		
	}
	
	String formatEmployeeName(String name) {
		name = name.toLowerCase();
		String formattedName = "";
		String[] nameArray = name.split(" ");
		for (String s: nameArray) {
			formattedName += s.replace(s.charAt(0), s.toUpperCase().charAt(0)) + " ";
		}
		return formattedName;
	}
	
	void generateEmail() {
		String email = this.ename.toLowerCase().trim().replace(" ", ".") + "@example.com";
		this.email = email;
	}
	
	void display() {
		System.out.println("Employee ID: "+this.eid);
		System.out.println("Name: "+this.ename);
		System.out.println("Email: "+this.email);
		System.out.println("Net Salary: "+this.net);
		System.out.println("Department: " + this.dept.departmentName + ", "+ this.dept.location);
	}
	
	void compute_net_sal() {
		this.net = this.gross*0.7;
	}
}

public class EmployeeDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String ename = "VaNSh RAstOgI";
		int eid = 3012;
		double basic = 790000;

		Employee Vansh = new Employee(eid, ename, basic);
		Vansh.compute_net_sal();
		Vansh.display();
		
		s.close();
	}

}
