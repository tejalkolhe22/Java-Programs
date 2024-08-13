package August;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentCompileExceptionThrow {
	public static void main(String[] args) throws IOException {
		int age=0;
		String name=null;
		float fees=0;
		char gen=' ';
		InputStreamReader is=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(is);
        System.out.println("Enter name");
           name= br.readLine();
        
        
        System.out.println("Enter age");
       
            age=Integer.parseInt(br.readLine());
       
        
        System.out.println("Enter fees");
        
            fees = Float.parseFloat(br.readLine());
        

        System.out.println("Enter gender");
        
            gen=br.readLine().charAt(0);
     
           
        System.out.println("name="+name);
        System.out.println("Age="+age);
        System.out.println("Fees="+fees);
        System.out.println("Gender="+gen);
        
	}

}


