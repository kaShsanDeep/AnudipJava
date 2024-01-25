package com.bank.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bank.model.BankEmployee;
import com.bank.utility.DBConnection;

public class BankEmployeeServiceIMplement implements BankEmployeeService {

	
	
	Connection con=null;
	String sql=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	
	
	public boolean registerEmployee(BankEmployee E1) throws Exception {
		
	try {	
		con=DBConnection.makeConnection();
		
		sql="insert into employee values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		ps=con.prepareStatement(sql);
		
		
		ps.setString(1, E1.getEmpId());
        ps.setString(2, E1.getEmpName());
		ps.setString(3, E1.getEmpEmail());
		ps.setString(4, E1.getEmpPhone());
		ps.setString(5, E1.getEmpAdd());
		ps.setString(6, E1.getEmpBranch());
		ps.setDouble(7, E1.getEmpSalary());		
		ps.setString(8, E1.getEmpPass());
		ps.setInt(9, E1.getLeaveBal());
		
		
		
		
	
		
		int i=ps.executeUpdate();
		if(i>0)
	 return true;
		
	}	
	catch(Exception e) {
		
		e.printStackTrace();
	}
	
		
		try {
			ps.close();
			con.close();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return false;
		
	

		
		
		
	}



	public BankEmployee getEmployeeById(String empId) {
		// TODO Auto-generated method stub
		
		con= DBConnection.makeConnection();
		sql="select*from employee where empId= ?";
		
		try {
		ps=con.prepareStatement(sql);
		ps.setString(1,empId);
		
		rs=ps.executeQuery();
		if(rs.next()) {
			
			BankEmployee BE =new BankEmployee(); 
			
			BE.setEmpId(rs.getString("empId"));				
			BE.setEmpName(rs.getString("empName"));
			BE.setEmpEmail(rs.getString("empEmail"));
			BE.setEmpPhone(rs.getString("empPhone"));
			BE.setEmpAdd(rs.getString("empAdd"));
			BE.setEmpBranch(rs.getString("empBranch"));
			BE.setEmpSalary(rs.getDouble("empSalary"));
			BE.setEmpPass(rs.getString("empPass"));
			BE.setLeaveBal(rs.getInt("LeaveBal"));
			return BE;
		}
		
		}
		catch(Exception e) {
			
			System.out.println("something went wrong : while fetching the from database:");
		}
		
		
		return null;
	}


	

	
	
	public String login(String username, String pwd)throws Exception{
		//fetching the account details by username
		con=DBConnection.makeConnection();
		String query="select * from employee where empName= '"+username+"'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
	
		if(rs.next()) {
		//fetching the password from db
			String epwd=rs.getString(8);
			//matching the db password with enterd password
			if(epwd.equals(pwd)) {				
		String eid=rs.getString(1);
			//if login success we can return cId
			return eid;
			}
			else {
			return null;
				}
			}
			else {
			return null;
			}
	}
		
	
	
	
	public int  leavebalance(String empId)throws Exception {
		
		con=DBConnection.makeConnection();	
		String query="select * from employee where empId='"+empId+"'";	
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		
		int LeaveTaken = rs.getInt(9);
		
			int leave=0;
		
				leave  = 4-LeaveTaken;
		
				return leave;	
		}



	public String passwordChange(String emp, String oldpin, String newPin) throws Exception {
	
		
		con=DBConnection.makeConnection();
		//getting details of the user
		String query="select * from employee where empId='"+emp+"'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String pwd=rs.getString(8);
		//matching present password to update new password
		if(pwd.equals(oldpin)) {
			String query2="update employee set empPass='"+newPin+"' where empId='"+emp+"'";
			PreparedStatement pst=con.prepareStatement(query2);
			pst.executeUpdate();
			
			
			return newPin;
		}
		else {
			
		return null;
	}
	
	
	





	}



	



	
}
