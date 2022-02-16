package com.collection.BrowserNavigator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        Browser browser=new Browser();
        do {
        	System.out.print("\n1.Browse New URL\n2.Forward\n3.Backword\n4.Exit\nEnter your choice:");
        	choice=sc.nextInt();
        	switch(choice) {
        	case 1:String url=sc.next(); browser.newUrl(url);break;
        	case 2:browser.moveForward();break;
        	case 3:browser.moveBackward();break;
        	case 4:break;
        	default:System.out.println("Enter Valid Option! :|");
        	}
        }while(choice!=4);
        sc.close();
    }
}
