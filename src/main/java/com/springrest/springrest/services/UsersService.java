package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import com.springrest.springrest.entity.Users;

public interface UsersService {

	public List<Users>getUserss();

	

	public Optional<Users> getUsers(long parseLong);



	public Users addUsers(Users Users);



	public Users updateUsers(Users Users);



	public void deleteUsers(long parseLong);
}
