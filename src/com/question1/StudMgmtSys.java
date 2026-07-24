package com.question1;

import java.util.Scanner;

public class StudMgmtSys {
	  public static String name[]=new String[2];
	  public static int rollNo[]=new int[2];
	  
	  public static int index=0;

	 public static Scanner scanner=new Scanner(System.in);

public static void main(String[] args) {
	
	int input;
	
	while(true) {
		System.out.println("Student Management System");
		
		System.out.println("Enter 1 to add Student");
		System.out.println("Enter 2 to View Student");
		
		input=scanner.nextInt();
		
		switch(input) {
		case 1: addStudent();
		break;
		
		case 2: viewStudent();
		break;
		}
	}
}



private static void addStudent() {
	System.out.println("This is a add student method");	
	
}

private static void viewStudent() {
System.out.println("This is a view student method");	
}
}
