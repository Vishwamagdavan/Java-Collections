package com.collection.sortbypriority;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class NameComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

class EmpIDComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		return o1.getEmpid().compareTo(o2.getEmpid());
	}

}

class DesignationComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		if(o1.getDesignation()>o2.getDesignation())
			return 1;
		else if(o1.getDesignation()<o2.getDesignation())
			return -1;
		return 0;
		
	}

}

class SalaryComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary()>o2.getSalary())
			return 1;
		else if(o1.getSalary()<o2.getSalary())
			return -1;
		return 0;
	}

}

public class Detail {
	private final static String MANAGER="Manager";
	private final static String LEAD="Lead";
	private final static String DEVELOPER="Developer";
	private final static String TESTER="Tester";
	private ArrayList<Employee> employees;

	Detail() {
		employees = new ArrayList<>();
	}

	public void addEmployee(String empid, String name, String designation, double salary) {
		Employee employee = new Employee(empid, name, designation, salary);
		employees.add(employee);
		System.out.println("Employee Added Successfully!!");
	}

	public void removeEmployee(String empid) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getEmpid().equals(empid)) {
				employees.remove(i);
				System.out.println("Employee Deleted Successfullly!!");
				break;
			}
		}
	}
	public static String getDesginationString(int type) {
		if(type==1)
			return MANAGER;
		else if(type==2)
			return LEAD;
		else if(type==3)
			return DEVELOPER;
		else if(type==4)
			return TESTER;
		return "";
	}
	public void displayEmployees() {
		System.out.println("\n EMPID\t NAME\t DESIGNATION\t SALARY");
		for (Employee employee : employees) {
			System.out.println(employee.getEmpid() + "\t" + employee.getName() + "\t" + getDesginationString(employee.getDesignation()) + "\t"
					+ employee.getSalary());
		}
	}

	public void sortByName() {
		Collections.sort(employees, new NameComparator());
		displayEmployees();
	}

	public void sortByEmpid() {
		Collections.sort(employees, new EmpIDComparator());
		displayEmployees();
	}

	public void sortByDesgination() {
		Collections.sort(employees, new DesignationComparator());
		displayEmployees();
	}

	public void sortBySalary() {
		Collections.sort(employees, new SalaryComparator());
		displayEmployees();
	}
}
