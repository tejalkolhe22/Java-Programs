package com.edu;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {

        int sum=0;
        int a[]=new int[8];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter "+a.length+" elements");
        for(int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
        }
        
      
        System.out.println("Array elements are");
        for(int i=0;i<a.length;i++) {
            //System.out.println("a["+i+"]="+a[i]);
            System.out.println(a[i]); 
        }
  
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i]; 
        }
        
        System.out.println("Sum of all array elements "+sum);
        
        float avg =(float)sum/a.length;  
        System.out.println("Average of all array elements "+avg);
    }


}



