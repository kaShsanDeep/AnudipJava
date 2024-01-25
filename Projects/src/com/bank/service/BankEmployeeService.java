package com.bank.service;

import com.bank.model.BankEmployee;


public interface BankEmployeeService {

	


	public boolean registerEmployee(BankEmployee E1) throws Exception;
	
	public BankEmployee getEmployeeById(String eID)throws Exception;
	
	public int  leavebalance(String empId)throws Exception;
	public String passwordChange(String emp, String oldpin,String newPin)throws Exception;
	
	
}
