package com.edu;

import java.util.Scanner;

public class ElectricBill {

	public static void main(String[] args) {
		 String name;
	        int units;
	        float totalamount=0,billamount;
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter name of customer");
	        name = sc.nextLine();
	        
	        System.out.println("Enter the units");
	        units = sc.nextInt();
	        
	        if(units>=1 && units<=100) {
	            totalamount = units*0.2f;
	        }else if(units>=100 && units<=200) {
	            totalamount = 100*2.0f + (units-100)*3.0f;
	        }else {
	            billamount = 100*2.0f + (units-200)*3.0f +(units-300)*5.0f;
	                    totalamount = billamount+(billamount*2.5f/100);
	        }
	        
	 System.out.println("Name =" +name);
	 System.out.println("Units consumed ="+units);
	 System.out.println("billamount ="+totalamount);
	 System.out.println("totalamount ="+totalamount);
	        
	        
	    }
	}

	

