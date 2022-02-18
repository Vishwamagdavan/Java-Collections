package com.collection.loadbalancer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to API Request!!");
		System.out.print("\nEnter the no. of Servers:");
		int servers=sc.nextInt();
		LoadBalancer balancer=new LoadBalancer(servers);
		System.out.println("\nEnter the no.of Clients Requesting:");
		int clients=sc.nextInt();
		
		for(int i=0;i<clients;i++) {
			Client client=addClient()
		}
		
		sc.close();
	}
}
