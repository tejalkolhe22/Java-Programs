package com.ed;

public class AddMathod {

	public static void main(String[] args) {
		 AddMathod obj=new AddMathod();
		 System.out.println(obj.add1(10, 30));
		 System.out.println(obj.add(10,30,40));
	}
	public int add1 (int a,int b)
	{
		return a+b;
	}
	public int add (int a,int b,int c)
	{
		return a+b+c;
	}
}


