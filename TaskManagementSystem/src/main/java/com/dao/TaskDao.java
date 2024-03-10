package com.dao;

public interface TaskDao {

	
    public void addTask(String a, String b, String c);
	public void deleteTask(int taskId);
	public void editTask();
	public void displayTask();
	
	
}
