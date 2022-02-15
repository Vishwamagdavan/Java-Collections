package com.collection.sortbypriority;

class Employee {
	private String empid;
	private String name;
	private int designation;
	private double salary;
	private final int MANAGER=1;
	private final int LEAD=2;
	private final int DEVELOPER=3;
	private final int TESTER=4;
	
	Employee(String empid,String name,String designation,double salary){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		if(designation.equals("Manager"))
			this.designation=MANAGER;
		else if(designation.equals("Lead"))
			this.designation=LEAD;
		else if(designation.equals("Developer"))
			this.designation=DEVELOPER;
		else if(designation.equals("Tester"))
			this.designation=TESTER;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public int getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
