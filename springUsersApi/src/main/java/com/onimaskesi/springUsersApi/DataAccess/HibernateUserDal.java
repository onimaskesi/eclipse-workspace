package com.onimaskesi.springUsersApi.DataAccess;

import javax.persistence.EntityManager; //JPA

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onimaskesi.springUsersApi.Entities.User;

@Repository
public class HibernateUserDal implements IUserDal {

	private EntityManager entityManager;

	@Autowired
	public HibernateUserDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public void update(User user) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);
	}

	@Override
	@Transactional
	public void delete(User user) {
		Session session = entityManager.unwrap(Session.class);
		session.delete(user);
	}

	@Override
	public User login(String email, String password) {
		Session session = entityManager.unwrap(Session.class);

		User user = (User) session.createQuery("FROM User U WHERE U.email = :email and U.password = :password")
				.setParameter("email", email).setParameter("password", password).uniqueResult();

		return user;
	}

	@Override
	public String signup(User user) {
		Session session = entityManager.unwrap(Session.class);

		User userInDB = (User) session.createQuery("FROM User U WHERE U.email = :email")
				.setParameter("email", user.getEmail()).uniqueResult();

		if (userInDB != null) {
			return "User Already Exist!";
		} else {
			session.saveOrUpdate(user);
			return "User sign up successfully!";
		}

	}

}
