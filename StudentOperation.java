package com.ed;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.ed.DataBaseConnections;


public class StudentOperation {
	private static Connection  conn;
	private static PreparedStatement pst;
	 private static String sql;

	 private static int sid;
	 private static int sage;
	 private static String sname;
	 private static String semail;
	 
	public static void displayStudent() throws ClassNotFoundException, SQLException {
		conn=DataBaseConnections.getConnection();
		String s="select * from stud";
		//step3.create the statement 
				Statement stmt=conn.createStatement();
				//step4.execute the  query
				ResultSet rst=stmt.executeQuery(s);
				
				System.out.println("eid\tename\tesalary\tdid");
				while(rst.next()) {
				  sid=rst.getInt("sid");
				  sname=rst.getNString("sname");
				  sage=rst.getInt("sage");
				  semail=rst.getNString("semail");
				  System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+semail);
				}
		
	}
	public static void addStudent() throws SQLException, ClassNotFoundException {
		conn=DataBaseConnections.getConnection();
		  Scanner sc=new Scanner(System.in);
	      System.out.println("Enter  Stud  id");
	      sid=sc.nextInt();
		
		  String stql="select * from stud where sid=?";
	      pst=conn.prepareStatement(stql);
	      pst.setInt(1, sid);
	      ResultSet rs=pst.executeQuery();
	      if(rs.next()) {
	    	  System.out.println(sid+"already exists");
	      }
	      else {
	    	  System.out.println("Enter the student  name");
	    	  sname=sc.next();
	    	  System.out.println("Enter the student age ");
	    	  sage=sc.nextInt();
	    	  System.out.println("Enter the  student email");
	    	  semail=sc.next();
	    
	    	  String instsql="insert into stud(sid,sname,sage,semail) values(?,?,?,?)";
	    	  pst=conn.prepareStatement(instsql);
	    	  pst.setInt(1, sid);
	    	  pst.setString(2,sname);
	    	  pst.setFloat(3, sage);
	    	  pst.setString(4,semail);
	    	  
	    	  int i =pst.executeUpdate();
	    	  if(i>0) {
	    		  System.out.println("Student Record added successfully");
	    	  }
	}
	
	}
	public static void deleteStudentByid() throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter id to delete record");
        int id  = sc.nextInt();
		conn = DataBaseConnections.getConnection();
		String sql="select * from stud where sid=?";
       pst=conn.prepareStatement(sql);
       pst.setInt(1, id);
       //select * from 
       ResultSet rs1=pst.executeQuery();
       if(rs1.next()) {   //if record exists,then go for delete
       	String delsql="delete from  stud where sid=?";
       	pst=conn.prepareStatement(delsql);
       	pst.setInt(1, id);
       	int r = pst.executeUpdate();
       	if(r>0) {
       		System.out.println("Record with id="+id+" is deleted");
       	}
       	
       }else {
       	System.out.println("record not exists");
       }
		
		
		
	}
	public static void updateStudentByid() throws ClassNotFoundException, SQLException {
		conn = DataBaseConnections.getConnection();
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter id to update the record");
        int id  = sc.nextInt();
        System.out.println("Enter the name to update the record");
        String name=sc.next();
        System.out.println("Enter the email to update the record");
        String email=sc.next();
        String sql="Select * from stud where sid=?";
        pst=conn.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs1=pst.executeQuery();
        if(rs1.next()) {   //if record exists,then go for delete
        	//String upssql= "update studset sname='"+name+"' where sid="+id;
        	String upssql= "update stud set sname=?,semail=? where sid=?";
        	
        	pst=conn.prepareStatement(upssql);
        	pst.setString(1, name);
        	pst.setString(2,email);
        	pst.setInt(3, id);

        	int r = pst.executeUpdate();
        	if(r>0) {
        		System.out.println("student email and name  changed based on id successfully");
            
        	}
        	
        }else {
        	System.out.println("Record not exists");
        }
		
	}
	public static void getEmployeeByid() throws ClassNotFoundException, SQLException {
		conn = DataBaseConnections.getConnection();
		 Scanner sc = new Scanner(System.in);

	        System.out.println("enter  the id ");
	       sid =sc.nextInt();
	        
	       sql="select *from stud  where sid=?";
	        
	        pst = conn.prepareStatement(sql);
	        pst.setInt(1, sid);
	        ResultSet rs = pst.executeQuery();
	        if(rs.next())
	        {
	            System.out.println("sid\tsname\tsage\tsemail");
	            sid=rs.getInt("sid");
	            sname=rs.getString("sname");
	            sage=rs.getInt("sage");
	            semail=rs.getNString("semail");
	            
	            System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+semail);
	            
	                    
	        }
	        else
	        {
	            System.out.println(" stud id not exist");
	        }
	        
	    }
		
	}
	
	
	 

