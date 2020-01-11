package com.jwt.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jwt.hibernate.bean.User;

public class UserDAO {

	public void addUserDetails(String itemNumber, String price, String firstName, String lastName, String method, 
			String cardNumber, String address) {
		try {
			// 1. configuring hibernate
			Configuration configuration = new Configuration().configure();

			// 2. create sessionfactory
			SessionFactory sessionFactory = configuration.buildSessionFactory();

			// 3. Get Session object
			Session session = sessionFactory.openSession();

			// 4. Starting Transaction
			Transaction transaction = session.beginTransaction();
			User user = new User();
			user.setItemNumber(itemNumber);
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setPrice(price);
			user.setAddress(address);
			user.setCardNumber(cardNumber);
			user.setMethod(method);
			
			session.save(user);
			transaction.commit();
			System.out.println("\n\n Details Added \n");

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}

	}

}
