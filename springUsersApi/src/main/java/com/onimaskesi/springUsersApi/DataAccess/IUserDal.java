package com.onimaskesi.springUsersApi.DataAccess;

import java.util.List;

import com.onimaskesi.springUsersApi.Entities.User;

public interface IUserDal {

	List<User> getAll();

	void add(User user);

	void update(User user);

	void delete(User user);

}
