package com.edu;

import java.util.Scanner;

public class Large4 {

	public static void main(String[] args) {

        
		        
		       int n1,n2,n3,n4, large;
		        
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.println("Enter first number");
		        n1=sc.nextInt();
		        
		        System.out.println("Enter second number");
		        n2=sc.nextInt();
		        
		        System.out.println("Enter third number");
		        n3=sc.nextInt();
		        
		        System.out.println("Enter Fourth number");
		        n4=sc.nextInt();
		        
		        
		        large = (n1>n2 && n1>n3 && n1>n4)?n1 :(n2>n1 && n2>n3 && n2>n4)?n2:(n3>n2 && n3>n2 &&n3>n4)?n3:n4;
		        System.out.println("The largest of "+n1+" , "+n2+","+n3+"and "+n4 +"is "+large);
		        
		    

	}

}
