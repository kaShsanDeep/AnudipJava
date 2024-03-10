package com.hibernate;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.Entities.Task;
import com.Entities.User;
public class hibernateUtil {
	


	



		private static SessionFactory sessionFactory;

		public static SessionFactory getSessionFactory() {
			if (sessionFactory == null) {
				try {
					Properties settings = new Properties(); // legacy class
					settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
					settings.put(Environment.URL, "jdbc:mysql://localhost:3306/mydb");
					settings.put(Environment.USER, "root");
					settings.put(Environment.PASS, "sandeep");
					settings.put(Environment.SHOW_SQL, "true");
					settings.put(Environment.HBM2DDL_AUTO, "update");

					// settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");

					Configuration cfg = new Configuration();
					cfg.setProperties(settings);
					cfg.addAnnotatedClass(Task.class);
					cfg.addAnnotatedClass(User.class);
					

					ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
							.applySettings(cfg.getProperties()).build();

					sessionFactory = cfg.buildSessionFactory(serviceRegistry);

				} 
				catch (Exception ex) {
					System.out.println("error aaya");
				}
			}
			return sessionFactory;
		}

	}

	
	
	

