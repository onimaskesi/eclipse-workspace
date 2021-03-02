package com.onimaskesi.springUsersApi.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onimaskesi.springUsersApi.DataAccess.IUserDal;
import com.onimaskesi.springUsersApi.Entities.User;

@Service
public class UserManager implements IUserService {

	private IUserDal userDal;

	@Autowired
	public UserManager(IUserDal userDal) {
		this.userDal = userDal;
	}

	@Override
	@Transactional
	public void update(User user) {

		userDal.update(user);

	}

	@Override
	@Transactional
	public void delete(User user) {

		userDal.delete(user);

	}

	@Override
	public User login(String email, String password) {

		User user = userDal.login(email, password);

		return user;
	}

	@Override
	public String signup(User user) {

		return userDal.signup(user);
	}

}
