package August;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StudentCompiletimeException {

	public static void main(String[] args) {
		int age=0;
		String name=null;
		float fees=0;
		char gen=' ';
		InputStreamReader is=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(is);
        System.out.println("Enter name");
        try {
            name= br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("Enter age");
        try {
            age=Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("Enter fees");
        try {
            fees = Float.parseFloat(br.readLine());
        } catch (NumberFormatException | IOException e) {
           e.printStackTrace();
        }

        System.out.println("Enter gender");
        try {
            gen=br.readLine().charAt(0);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("name="+name);
        System.out.println("Age="+age);
        System.out.println("Fees="+fees);
        System.out.println("Gender="+gen);
        
	}

}
