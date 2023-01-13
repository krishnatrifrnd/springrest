package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.springrest.springrest.entity.Users;

public interface UsersDao extends JpaRepository<Users, Long> {

}
