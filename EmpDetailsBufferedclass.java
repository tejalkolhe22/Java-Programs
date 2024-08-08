package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmpDetailsBufferedclass {

	public static void main(String[] args) throws IOException {
		String name;
       int age; 
      double phone;
		float salary;

		String emailid;
        
		char gen;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		

		System.out.println("Enter name");

		

		name= br.readLine();

	
		System.out.println("Enter age");

		

		age=Integer.parseInt(br.readLine());
		
		System.out.println("Enter phone");

		

		

		phone=Long.parseLong(br.readLine());

		System.out.println("Enter Salary");

		salary=Float.parseFloat(br.readLine());
		System.out.println("Enter email");

		
		emailid= br.readLine();

		

		System.out.println("Enter gender");

		

		gen=br.readLine().charAt(0);

	

		System.out.println("Employee Details:"); System.out.println("Name =: "+name);

		System.out.println("age=: "+age);

		

		System.out.println("phone=: "+phone); 
		System.out.println("salary: "+salary);

		System.out.println("email: "+emailid);

		

		System.out.println("gen: "+gen);

		
	}

}
