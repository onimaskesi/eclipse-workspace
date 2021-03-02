package com.onimaskesi.springUsersApi.DataAccess;

import java.util.List;

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
	@Transactional // AOP -> Aspect Oriented Programming
	public List<User> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<User> users = session.createQuery("from User", User.class).getResultList();
		return users;
	}

	@Override
	@Transactional
	public void add(User user) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);
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

}
