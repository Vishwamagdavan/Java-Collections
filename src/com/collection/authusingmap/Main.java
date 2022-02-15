package com.collection.authusingmap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
	private final static String EOF=null;
	static void PopulateData(PasswordManager authservice) {
		try {
			BufferedReader usernamereader=new BufferedReader(new FileReader("usernames.txt"));
			BufferedReader passwordreader=new BufferedReader(new FileReader("passlist.txt"));
			
			String username=usernamereader.readLine();
			String password=passwordreader.readLine();
			int i=0;
			while(username!=EOF && password!=EOF && i<1000) {
				authservice.addUser(username, password);
				password=passwordreader.readLine();
				username=usernamereader.readLine();
				i++;
			}
			usernamereader.close();
			passwordreader.close();
		} catch (Exception e) {
			System.out.println("File not Found!");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t\tWelcome to User Auth using Hashmap!");
		PasswordManager authservice=new PasswordManager();
		System.out.println("Populating Data in Application");
		PopulateData(authservice);
		System.out.println("1.Login\n2.Register\n3.Remove\n4.exit");
		
		int choice;
		do {
			System.out.print("Enter your choice:");
			choice=sc.nextInt();
			switch(choice) {
				case 1:authUser(authservice,sc);break;
				case 2:registerUser(authservice,sc);break;
				case 3:removeUser(authservice,sc);break;
				case 4: break;
				default: System.out.println("Enter valid option");
			}
		}while(choice!=4);
		
		sc.close();
	}
	private static void removeUser(PasswordManager authservice, Scanner sc) {
		System.out.println("Enter Login Details!");
		System.out.print("Enter the username:");
		String username=sc.next();
		
		System.out.print("Enter the password");
		String passsword=sc.next();
		
		authservice.removeUser(username, passsword);
		
	}
	public static void registerUser(PasswordManager authservice,Scanner sc) {
		System.out.println("Enter Login Details!");
		System.out.print("Enter the username:");
		String username=sc.next();
		
		System.out.print("Enter the password");
		String passsword=sc.next();
		
		authservice.addUser(username, passsword);
	}
	public static void authUser(PasswordManager authservice,Scanner sc) {
		System.out.println("Enter Login Details!");
		System.out.print("Enter the username:");
		String username=sc.next();
		
		System.out.print("Enter the password");
		String passsword=sc.next();
		
		if(authservice.userLogin(username, passsword)) {
			System.out.println("Valid Login");
		}
		else {
			System.out.println("Invalid Login :|");
		}
	}
}
