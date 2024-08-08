package com.edu;

import java.util.Scanner;

public class rect {

		    public static void main(String[] args) {
		        int l,b,area; //declaration
		        //float l,b,area;
		        
		        //assignment
		        //    l=25; 
		        //b=56;
		        
		        //User input
		        //create an object of Scanner class
		        
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.println("Enter length of Reactangle");
		        l=sc.nextInt();
		        //l = sc.nextFloat();
		        //float nextFloat();
		        //double,  short, byte,  long
		        // nextDouble(), nextShort(), nextByte(), nextLong();
		        
		        System.out.println("Enter breadth of a reactangle");
		        b = sc.nextInt();
		        
		        area = l*b;
		        System.out.println("The area of Reactangle of length = "+l+" and breadth = "+b+" is "+area);

	}

}
