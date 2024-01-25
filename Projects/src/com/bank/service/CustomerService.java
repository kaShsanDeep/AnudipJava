package com.bank.service;

import com.bank.model.bankingcustomer;

public interface CustomerService {
	
	
	public int registerCustomer(bankingcustomer b1) throws Exception;
	public int withdraw(int cId,int amount) throws Exception;
	public int deposit(int cId, int amount) throws Exception;
	public int checkBalance(int cId) throws Exception;
	public bankingcustomer getCustomerById(int c1);
	public boolean updateCustomer(bankingcustomer c)throws Exception;
}
