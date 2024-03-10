package com.daoImplement;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.Entities.Task;
import com.dao.TaskDao;
import com.hibernate.hibernateUtil;

public class TaskDaoImpl implements TaskDao {

	Scanner sc = new Scanner(System.in);

	@Override
	public void addTask(String title, String description, String date) {

		Session session = hibernateUtil.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();

		Task task = new Task();

		task.setId(0);
		task.setTitle(title);
		task.setDescription(description);
		task.setDate(date);

		session.save(task);
		ts.commit();
		session.close();
		System.out.println("Task data have been save Successfully!!");

	}

	@Override
	public void deleteTask(int taskId) {

		Session session = hibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Task task = (Task) session.get(Task.class, taskId);

		session.delete(task);

		tx.commit();
		session.close();

		System.out.println("deleted success");
	}

	@Override
	public void editTask() {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayTask() {

	}

}
