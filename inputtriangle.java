package com.edu;

import java.util.Scanner;


public class inputtriangle {

	public static void main(String[] args) {
	
		       float radius, area;
		       
		       Scanner scanner = new Scanner(System.in);
		      
		       System.out.println("Enter radius of a Circle");
		       radius = scanner.nextFloat();
		       
		      // area =  (float)22/7*radius*radius;
		       
		       area =  3.14159f*radius*radius;
		       
		       System.out.println("Area of Cicle of radius = "+radius+" is "+area);
		       
		    }
		


	}


