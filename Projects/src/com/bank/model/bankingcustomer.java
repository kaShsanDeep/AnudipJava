package com.bank.model;

public class bankingcustomer {
	private int cId;
	private String cName;
	private String cPassword;
	private String cPhone;
	private int cAccbal;
	private String bankID;
	
	public bankingcustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	public bankingcustomer(int cId, String cName, String cPassword, String cPhone, int cAccbal,String bankID) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cPassword = cPassword;
		this.cPhone = cPhone;
		this.cAccbal = cAccbal;
		this.bankID=bankID;
	}
	

	
	

	@Override
	public String toString() {
		return "bankingcustomer [cId=" + cId + ", cName=" + cName + ", cPassword=" + cPassword + ", cPhone=" + cPhone
				+ ", cAccbal=" + cAccbal + ", bankID=" + bankID + "]";
	}





	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcPassword() {
		return cPassword;
	}

	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

	public String getcPhone() {
		return cPhone;
	}

	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}

	public int getcAccbal() {
		return cAccbal;
	}

	public void setcAccbal(int cAccbal) {
		this.cAccbal = cAccbal;
	}

	public String getBankID() {
		return bankID;
	}

	public void setBankID(String bankID) {
		this.bankID = bankID;
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
