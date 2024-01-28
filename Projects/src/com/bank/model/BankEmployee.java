package com.bank.model;

public class BankEmployee {

	
	private String empId;
	private String empName;
	private String empEmail;
	private String empPhone;
	private String empAdd;
    private String empBranch;
    private double empSalary;
	private String empPass;
	private int LeaveBal;
	
	public BankEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankEmployee(String empId, String empName, String empEmail, String empPhone, String empAdd, String empBranch,
			double empSalary, String empPass, int leaveBal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empPhone = empPhone;
		this.empAdd = empAdd;
		this.empBranch = empBranch;
		this.empSalary = empSalary;
		this.empPass = empPass;
		LeaveBal = leaveBal;
	}

	@Override
	public String toString() {
		return "BankEmployee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empPhone="
				+ empPhone + ", empAdd=" + empAdd + ", empBranch=" + empBranch + ", empSalary=" + empSalary
				+ ", empPass=" + empPass + ", LeaveBal=" + LeaveBal + "]";
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	public String getEmpBranch() {
		return empBranch;
	}

	public void setEmpBranch(String empBranch) {
		this.empBranch = empBranch;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpPass() {
		return empPass;
	}

	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}

	public int getLeaveBal() {
		return LeaveBal;
	}

	public void setLeaveBal(int leaveBal) {
		LeaveBal = leaveBal;
	}

	
	
	
	
	
	
	
	
	
	
  }
