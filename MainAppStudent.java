package com.ed;

import java.util.Scanner;

class Student {
	int sid;
	String sname;
	float sfees;
	String semailid;
	void inputdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,name,fees and emailid");
		sid=sc.nextInt();
		sname=sc.next();
		sfees=sc.nextFloat();
		semailid=sc.next();
	}
	void displaydata() {
		System.out.println("id="+sid);
		System.out.println("name="+sname);
		System.out.println("fees="+sfees);
		System.out.println("emailid="+semailid);
	}
	
}

public class MainAppStudent {

	public static void main(String[] args) {
		System.out.println("Main Method ");
		Student st=new Student();
		st.inputdata();
		st.displaydata();
		Student st1=new Student();
		st1.inputdata();
		st1.displaydata();
	}

}
