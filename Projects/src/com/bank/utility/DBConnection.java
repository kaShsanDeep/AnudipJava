package com.bank.utility;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
	

	
	public static void main(String[] args) {
		
		Connection con=makeConnection();
		if(con!=null)
			System.out.println("Connection made successfully");
		else
			System.out.println("Error");
	}

	
	
	
	
	
	
	public static Connection makeConnection() {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudipbank","root", "Sandeep@123");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	
	
	
	

}
