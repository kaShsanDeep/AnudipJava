package com.bank.model;

public class BankManager {

	
	private String AdminId;
	private String AdminName;
	private String AdminPass;
	private String empId;	
	private String Branch;
	public BankManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BankManager [AdminId=" + AdminId + ", AdminName=" + AdminName + ", AdminPass=" + AdminPass + ", empId="
				+ empId + ", Branch=" + Branch + "]";
	}
	
	
	
	
	public String getAdminId() {
		return AdminId;
	}
	public void setAdminId(String adminId) {
		AdminId = adminId;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getAdminPass() {
		return AdminPass;
	}
	public void setAdminPass(String adminPass) {
		AdminPass = adminPass;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	System.out.println("Enter 2-------> Update Employee details");
	System.out.println("Enter 3-------> Delete employee");
	System.out.println("Enter 4-------> Show all Employee ");
	System.out.println("Enter 5-------> Search Employee on the basis of id");
	System.out.println("Enter 6-------> Search Employee  on the basis of name");
*/
	
	
	
	
	
	
}
