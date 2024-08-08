package com.edu;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		 char choice;
		 int side = 0;
         float radius,base,height,length, breadth,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'C' to find area of Circle");
        System.out.println("Enter 'T' to find area of Triangle");
        System.out.println("Enter 'S' to find area of Square");
        System.out.println("Enter 'R' to find area of Reactangle");
        System.out.println("Enter your choice");
        choice = sc.next().charAt(0);
       // System.out.println("choice ="+choice);
        
        switch(choice) {
        case 'C': System.out.println("Area of Circle");
        System.out.println("Enter radius");
        radius=sc.nextFloat();
            area=3.14159f*radius*radius;
                  System.out.println("Area of the Circle:"+area);
    
                   break;
        case 'T': System.out.println("Area of Triangle");
        System.out.println("Enter base and height of a triangle");
        base =sc.nextFloat();
        height = sc.nextFloat();
        area = 0.5f*base*height;
        System.out.println("Area of Triangle ="+area);
                    break;
                    
        case 'S': System.out.println("Area of Square");
        System.out.println("Enter the side of a square");
        length = sc.nextFloat();
        area = length* length;
        System.out.println("Area of a square ="+area);
               
        break;
case 'R': System.out.println("Area of  Rectangle");

System.out.println("Enter length and breadth of a reactangle");
length = sc.nextFloat();
breadth = sc.nextFloat();
area = length*breadth;

System.out.println("Area of Reactangle ="+area);

 break;
default: System.out.println("Invald input");


        
        
        }
	}
}


