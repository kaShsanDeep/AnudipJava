package com.bank.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bank.model.BankManager;
import com.bank.utility.DBConnection;

public class BankAdmin {
	
	Connection con=null;
	String sql=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	
	
	public String login(String username,String pwd)throws Exception{
		//fetching the account details by username
		con=DBConnection.makeConnection();
		
		String query="select * from admin where AdminName= '"+username+"'";
		
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
	
		if(rs.next()) {
		//fetching the password from db
			String Adpwd=rs.getString(3);
			//matching the db password with enterd password
			if(Adpwd.equals(pwd)) {				
	
				String AdminName=rs.getString(1);
			//if login success we can return cId
			return AdminName;
			}
			else {
			return null;
				}
			}
			else {
			return null;
			}
	}




	
	
	public BankManager getManagerByName(String AdminName) {
		// TODO Auto-generated method stub
		
		con= DBConnection.makeConnection();
		sql="select*from admin where AdminName= ?";
		
		try {
		ps=con.prepareStatement(sql);
		ps.setString(1,AdminName);
		
		rs=ps.executeQuery();
		
		if(rs.next()) {
			
			BankManager Ad =new BankManager(); 
				
     		Ad.setAdminId(rs.getString("AdminId"));				
			Ad.setAdminName(rs.getString("AdminName"));
			Ad.setAdminPass(rs.getString("AdminPass"));
			Ad.setEmpId(rs.getString("empId"));
	    	Ad.setBranch(rs.getString("Branch"));
			return Ad;
		}
		
		}
		catch(Exception e) {
			
			System.out.println("something went wrong : while fetching the from database:");
		}
		
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
