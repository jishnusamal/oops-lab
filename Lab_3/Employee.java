package lab3;

class employeeData {
	String ename;
	int eid;
	double basic, da, gross, net;
	
	void read(int eid, String ename, double basic) {
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
//		System.out.println(this.gross);
	}
	
}

public class Employee {

	public static void main(String[] args) {
		employeeData Vansh = new employeeData();
		String ename = "Vansh Rastogi";
		int eid = 3012;
		double basic = 790000;
		
		Vansh.read(eid, ename, basic);
		
		Vansh.compute_net_sal();
		
		Vansh.display();

	}

}
