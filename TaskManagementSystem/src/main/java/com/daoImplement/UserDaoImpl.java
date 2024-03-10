package com.daoImplement;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Entities.Task;
import com.Entities.User;
import com.dao.UserDao;
import com.hibernate.hibernateUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public void addUser(String name, String phone, String password, String email) {

		Session session2 = hibernateUtil.getSessionFactory().openSession();
		
		User obj = new User();

	   
		obj.setUserId(1);
		obj.setName(name);
		obj.setEmail(email);
		obj.setPass(password);
		obj.setPhone(phone);
		Transaction tx = session2.beginTransaction();

		session2.save(obj);
		tx.commit();
		session2.close();
		System.out.println("user data have been saved Successfully!!");

	}

	@Override
	public void deleteUser(int UserId) {

	}

	@Override
	public void editUser() {

	}

	@Override
	public void displayUser() {

	}
	
	@Override
	public boolean login(String email, String pass) {
		
		Session session = hibernateUtil.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		User user = (User)session.get(User.class, email);

		session.contains(pass, email);
         
		
		ts.commit();
		session.close();

		System.out.println("found user success");
		return true;
	}
		
		
		
		
	}


