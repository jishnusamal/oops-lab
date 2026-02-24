package Lab_4;

class Employee {
	String ename;
	int eid;
	double basic, da, gross, net;
	
	Employee() {
		this.ename = "";
		this.eid = 0;
		this.basic = 0;
		this.da = 0.52 * basic;
		this.gross = this.basic + this.da;
	}
	
	Employee(int eid, String ename, double basic) {
		this.ename = ename;
		this.eid = eid;
		this.basic = basic;
		this.da = 0.52 * basic;
		this.gross = this.basic + this.da;
	}
	
	void display() {
		System.out.println("Employee ID: "+this.eid);
		System.out.println("Name: "+this.ename);
		System.out.println("Net Salary: "+this.net);
	}
	
	void compute_net_sal() {
		this.net = this.gross*0.7;
	}
	
}

public class EmployeeDemo {

	public static void main(String[] args) {
		String ename = "Vansh Rastogi";
		int eid = 3012;
		double basic = 790000;

		Employee Vansh = new Employee(eid, ename, basic);
		Vansh.compute_net_sal();
		Vansh.display();
	}

}
