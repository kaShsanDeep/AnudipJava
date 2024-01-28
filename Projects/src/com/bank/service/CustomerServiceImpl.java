package com.bank.service;

import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

import com.bank.exception.CustomException;
import com.bank.model.bankingcustomer;
import com.bank.exception.DataProcessor;
import com.bank.utility.DBConnection;



public class CustomerServiceImpl implements CustomerService {

	Connection con=null;
	String sql=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	Scanner sk = new Scanner(System.in);
	DataProcessor processor = new DataProcessor();
	
	
	
	
	//register account
	public int registerCustomer(bankingcustomer b1)throws Exception {
		
		
		
		
		con=DBConnection.makeConnection();
		String username=b1.getcName();
		String quer2= "select * from banking where cName='"+username+"'";
		Statement st=con.createStatement();
		rs=st.executeQuery(quer2);
		
		if(rs.next()) {
			
			return -1;
			
		}
		else {
			
			con=DBConnection.makeConnection();
			String query="insert into banking(cId,cName,cPassword,cPhone,cAccbal,bankID) values(?,?,?,?,?,?)";
			
			ps=con.prepareStatement(query);
			ps.setInt(1,b1.getcId());
			ps.setString(2,b1.getcName());
			ps.setString(3, b1.getcPassword());
			ps.setString(4, b1.getcPhone());
			ps.setInt(5, b1.getcAccbal());
			ps.setString(6, b1.getBankID());
			
			int count=ps.executeUpdate();
			
			return count;
				
		}
		
	}
	
	public int login(String username, String pwd)throws Exception{
		//fetching the account details by username
		con=DBConnection.makeConnection();
		String query="select * from banking where cName= '"+username+"'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
	
		if(rs.next()) {
		//fetching the password from db
			String cpwd=rs.getString(3);
			//matching the db password with enterd password
			if(cpwd.equals(pwd)) {				
			int eid=rs.getInt(1);
			//if login success we can return cId
			return eid;
			}
			else {
			return 0;
				}
			}
			else {
			return -1;
			}
	}
	
	

	public int withdraw(int cId,int amount)throws Exception {
		//getting account details based on cId
		con=DBConnection.makeConnection();
		String query="select * from banking where cId="+cId;	
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		//fetching account balance
	
		int accbal=rs.getInt(5);
		try {
		processor.processData(accbal,amount);
		}catch(CustomException e) {
			 System.out.println("Custom Exception caught: " + e.getMessage());
				
			
		}
		
		if(accbal>amount) {
			accbal-=amount;
			String query2="update banking set cAccbal="+accbal+" where cId="+cId;
			//updating the accbalance after withdraw
			Statement st2=con.createStatement();
			int res=st2.executeUpdate(query2);
			
			return accbal;
				}	
		else {
			return -1;
			}
		}
		
		

	public int deposit(int cId, int amount)throws Exception{
		con=DBConnection.makeConnection();
		//depositing
		String query="select * from banking where cId="+cId;
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		if(rs.next())
		{
		int accbal=rs.getInt(5);
		//adding amount to account balance
		accbal+=amount;
		
		
		//update account balance
		String query2="update banking set cAccbal="+accbal+" where cId="+cId;
		PreparedStatement pst=con.prepareStatement(query2);
		pst.executeUpdate();
		return accbal;
		}
		else {
			return -1;
		}
	}
	
	
	public int checkBalance(int cId)throws Exception{
		con=DBConnection.makeConnection();
		//checking account balance
		String query="select * from banking where cId="+cId;
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		int accbal=rs.getInt(5);
		return accbal;
		
	}
	
	public int pinChange(int cId, String oldpin,String newPin)throws Exception{
		con=DBConnection.makeConnection();
		//getting details of the user
		String query="select * from banking where cId="+cId;
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String pwd=rs.getString(3);
		//matching present password to update new password
		if(pwd.equals(oldpin)) {
			String query2="update banking set cPassword="+newPin+" where cId="+cId;
			PreparedStatement pst=con.prepareStatement(query2);
			int count=pst.executeUpdate();
			return count;
		}
		else {
			return -1;
		}
		
	}

		
	
	
	 @Override
	public bankingcustomer getCustomerById(int c1) 
	
	{
		con=DBConnection.makeConnection();
		sql="select * from banking where cId=?";
		
		try {
			
			ps=con.prepareStatement(sql);
			ps.setInt(1, c1);
			
			rs=ps.executeQuery();
			
			if(rs.next()) {
				bankingcustomer c =new bankingcustomer();
				c.setcId(rs.getInt("cId"));	
				c.setcName(rs.getString("cName"));
				c.setcPassword(rs.getString("cPassword"));
				c.setcPhone(rs.getString("cPhone"));
				c.setcAccbal(rs.getInt("cAccbal"));
				c.setBankID(rs.getString("bankID"));
				
			
				
				
				return c;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		return null;
	}

	
	
	
	 @Override
     public boolean updateCustomer(bankingcustomer c) {
		
    	
		con=DBConnection.makeConnection();
		//
		sql="update banking set cName=?, cPassword=?, cPhone=?, cAccbal=? where cId=?";
		
		try {
			ps=con.prepareStatement(sql);	
			
		
			ps.setString(1,c.getcName());	
			ps.setString(2, c.getcPassword());		
			ps.setString(3, c.getcPhone());					
			ps.setInt(4, c.getcAccbal());	
			ps.setInt(5, c.getcId());	
			
			
			int i=ps.executeUpdate();
			if(i>0)
				return true;
			
		}
		catch(Exception e) {
			e.printStackTrace();
				}
		finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;

	}

     
     
   
}
