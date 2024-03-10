package com.Entities;

public interface TaskDao {

	
	abstract public void addTask(String a, String b, String c);
	public void deleteTask();
	public void editTask();
	public void displayTask();
	
	
}
