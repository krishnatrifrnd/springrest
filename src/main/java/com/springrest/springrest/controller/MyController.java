package com.springrest.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Users;
import com.springrest.springrest.services.UsersService;

@RestController
public class MyController {

	@Autowired
	private UsersService Usersservice;

	// Get the User
	@GetMapping("/Users")
	public List<Users> getUserss() {
		return this.Usersservice.getUserss();
	}

	// get single User
	@GetMapping("/Users/{UsersId}")
	public Optional<Users> getUsers(@PathVariable String UsersId) {
		return this.Usersservice.getUsers(Long.parseLong(UsersId));
	}

	// Create new User
	@PostMapping(path = "/Users", consumes = "application/json")
	public Users addUsers(@RequestBody Users Users) {
		return this.Usersservice.addUsers(Users);
	}

	// Update User
	@PutMapping("/Users")
	public Users updateUsers(@RequestBody Users Users) {
		return this.Usersservice.updateUsers(Users);
	}

	// delete User
	@DeleteMapping("/Users/{UsersId}")
	public ResponseEntity<HttpStatus> deleteUsers(@PathVariable String UsersId) {
		try {
			this.Usersservice.deleteUsers(Long.parseLong(UsersId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
