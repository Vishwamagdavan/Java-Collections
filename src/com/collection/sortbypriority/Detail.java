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
		//return o1.getDesignation().compareTo(o2.getDesignation());
		if(o1.getDesignation().equals("Manager") || o2.getDesignation().equals("Manager"))
			return 1;
		else if(o1.getDesignation().equals("Developer") && o2.getDesignation().equals("Manager"))
			return -1;
		else if(o1.getDesignation().equals("Manager") && o2.getDesignation().equals("Developer"))
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

	public void displayEmployees() {
		System.out.println("\n EMPID\t NAME\t DESIGNATION\t SALARY");
		for (Employee employee : employees) {
			System.out.println(employee.getEmpid() + "\t" + employee.getName() + "\t" + employee.getDesignation() + "\t"
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
