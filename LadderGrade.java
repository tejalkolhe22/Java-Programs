package com.edu;

import java.util.Scanner;

public class LadderGrade {
	public static void main(String[] args) {
		int marks;
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the marks");
			marks=sc.nextInt();
		
		
		if(marks>=90 && marks<=100)
		{
			System.out.println("Your grade is A");
		}
		else if(marks>=79 && marks<=89)
		{
			System.out.println("Your grade is B");
		}
		else if(marks>=50 && marks<=69)
		{
			System.out.println("Your grade is C");
		}
		else if(marks>=35 && marks<=49)
		{
			System.out.println("Your grade is D");
		}
		else if(marks>=0 && marks<=34)
		{
			System.out.println("Your grade is E");
		}
		else {
			System.out.println("Invalid Input");
		}
		
	}
}
