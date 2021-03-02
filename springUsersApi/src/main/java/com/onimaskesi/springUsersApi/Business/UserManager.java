package com.onimaskesi.springUsersApi.Business;

import java.util.List;

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
	public List<User> getAll() {
		return userDal.getAll();
	}

	@Override
	@Transactional
	public void add(User user) {

		userDal.add(user);
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

}
