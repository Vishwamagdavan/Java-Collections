package com.collection.sortemployee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
	private static final String EOF=null; 
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Employee List using Collections and Sortings");
		Detail details=new Detail();
		populateData(details);
		details.displayEmployees();
		
		int choice;
		do {
			System.out.print("\n1.Sort by Name\n2.Sort by EMPID\n3.Sort by Designation\n4.Sort by Salary\n5.Exit\nEnter your choice:");
			choice=inp.nextInt();
			switch(choice) {
			case 1:details.sortByName();break;
			case 2:details.sortByEmpid();break;
			case 3:details.sortByDesgination();break;
			case 4:details.sortBySalary();break;
			case 5:break;
			default:System.out.println("Enter valid choice");
			}
		}while(choice!=5);
		inp.close();
	}

	private static void populateData(Detail details) {
		try {
			BufferedReader reader=new BufferedReader(new FileReader("employees.txt"));
			String row=reader.readLine();
			while(row!=EOF) {
				String[] detail=row.split("\t");
				details.addEmployee(detail[0], detail[1], detail[2],Double.parseDouble(detail[3]));
				row=reader.readLine();
			}
			System.out.println("Data Population complété!");
			reader.close();
		} catch (Exception e) {
			System.out.println("Error in Opening File :|");
		}
		
	}
}
