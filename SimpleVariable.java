package com.edu;

public class SimpleVariable {

	int k;
	float p;
	long l;
	char ch;
	String s;
	static String collegename="RNSIT";
	public static void main(String[] args) {
		int m;
		
		
		//System.out.println("m="+m) ;//error local variables
		 SimpleVariable obj= new  SimpleVariable();
		 System.out.println("int value k="+obj.k);
		 System.out.println("Float value p="+obj.p);
		 System.out.println("Long value l="+obj.l);
		 System.out.println("char value ="+obj.ch);
		 System.out.println("String  value ="+obj.s);
		 System.out.println("College name static data" + collegename);
		 System.out.println("College name static data" +SimpleVariable.collegename);

	}

}
