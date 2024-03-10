package com.Entities;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.hibernateUtil;

public class TaskDaoImpl implements TaskDao {

	Scanner sc = new Scanner(System.in);

	@Override
	public void addTask(String title, String description, String date) {

		Session session = hibernateUtil.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();

		Task task = new Task();
		
		int id = new Random().nextInt(1000);
        task.setId(id);
		task.setTitle(title);
		task.setDescription(description);
		task.setDate(date);

		session.save(task);
		ts.commit();
		session.close();
		System.out.println("Task data have been save Successfully!!");

	}

	@Override
	public void deleteTask() {
		// TODO Auto-generated method stub

	}

	@Override
	public void editTask() {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayTask() {		
	
		
	}

}
