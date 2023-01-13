package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.springrest.dao.UsersDao;
import com.springrest.springrest.entity.Users;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersDao UsersDao;

	@Override
	public List<Users> getUserss() {
		return UsersDao.findAll();
	}

	@Override
	public Optional<Users> getUsers(long UsersId) {
		return UsersDao.findById(UsersId);
	}

	@Override
	public Users addUsers(Users Users) {
		return UsersDao.save(Users);
	}

	@Override
	public Users updateUsers(Users Users) {
		return UsersDao.save(Users);
	}

	@Override
	public void deleteUsers(long parseLong) {
		UsersDao.deleteById(parseLong);
	}
}
