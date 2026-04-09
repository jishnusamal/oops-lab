package edu.manipal.mahe.department;

public class Department {
	private String name;
	protected String manager;
	public String loc;
	
	public Department(String name, String manager, String loc) {
		this.setName(name);
		this.manager = manager;
		this.loc = loc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

//departmentName (String, private): Name of the department. 
//manager (String, protected): Department manager. 
//location (String, public): Department location.