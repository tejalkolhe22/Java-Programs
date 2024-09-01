package com.ed;

import java.sql.SQLException;
import java.util.Scanner;

import com.ed.StudentOperation;

public class MainStudentData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	while(true) {
		Scanner scan= new Scanner(System.in);
		System.out.println("*********Student Management System********");
		System.out.println("1.Display Student");
		System.out.println("2.Add Student");
		System.out.println("3.Delete Student by id");
		System.out.println("4.Update Student by id");
		System.out.println("5.get Student by id");
		System.out.println("Enter your choice");
		int ch = scan.nextInt();
		
		switch(ch) {
		case 1: StudentOperation.displayStudent();
		         break;
		case 2 : StudentOperation.addStudent();
		          break;
		case 3 :StudentOperation.deleteStudentByid();
                 break;
		case 4 :StudentOperation.updateStudentByid();
                  break;
		case 5 :StudentOperation.getEmployeeByid();
                  break;
		 default :System.out.println("Invalid input");
        
        
		}
		   System.out.println("Do you want to continue? , press Y to continue any other key to stop");
	        char ch1=scan.next().charAt(0);
	        if(ch1!='y') {
	            break;
	        }
	        
	    
	}
	         System.out.println("Program is terminated");
	    }
	}
	


