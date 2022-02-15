package com.collection.sortbypriority;

class Employee {
	private String empid;
	private String name;
	private String designation;
	private double salary;
	
	Employee(String empid,String name,String designation,double salary){
		this.empid=empid;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
