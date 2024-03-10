package com.dao;

public interface UserDao {
	
	
	    public void addUser(String name, String email, String phone,String pass);
		public void deleteUser(int UserId);
		public void editUser();
		public void displayUser();
		public boolean login(String email, String pass);

}
