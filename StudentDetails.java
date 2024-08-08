package com.edu;
import java.util.Scanner;


public class StudentDetails {

	public static void main(String[] args) {
	String name;
	int age;
	float fees;
	char gen; //M/F
	
	Scanner  sc = new Scanner(System.in);
	
	System.out.println("Enter name");
	name=sc.next();
	
	System.out.println("Enter age");
	age=sc.nextInt();
	
	System.out.println("Enter fees");
	fees=sc.nextFloat();
	
	System.out.println("Enter gender");
	gen=sc.next().charAt(0);
	
	System.out.println("Name ="+name);
	System.out.println("Age =" +age);
	System.out.println("Fees ="+fees);
	System.out.println("Gender ="+gen);
	
	
	

	}

}
