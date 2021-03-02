package com.onimaskesi.springUsersApi.Business;

import java.util.List;

import com.onimaskesi.springUsersApi.Entities.User;

public interface IUserService {

	List<User> getAll();

	void add(User user);

	void update(User user);

	void delete(User user);
}
