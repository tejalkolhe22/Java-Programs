package com.ed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnections {

	private static String driver="com.mysql.cj.jdbc.Driver";
    private static String url="jdbc:mysql://localhost:3306/batch_12999";
    private static String un="root";
    private static String pass="root";
    private static  Connection  conn=null;
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
    	if(conn==null) {
    		Class.forName(driver);
    		conn=DriverManager.getConnection(url,un,pass);
    		System.out.println(conn);
    	}
    	return conn;
    }


}
