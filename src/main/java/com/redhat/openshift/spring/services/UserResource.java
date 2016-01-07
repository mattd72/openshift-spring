package com.redhat.openshift.spring.services;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.redhat.openshift.spring.models.User;
import com.redhat.openshift.spring.models.Users;
import com.redhat.openshift.spring.repositories.UserRepo;

@Path("/users")
@RestController
@RequestMapping(path = "/users")
public class UserResource {

	@Autowired
	private UserRepo userRepo;

	public UserResource() {
	}

	@POST
	@RequestMapping(method = RequestMethod.POST)
	public User create(User user) {
		return userRepo.save(user);
	}

	@GET
	@RequestMapping(method = RequestMethod.GET, params = "/{id}")
	public User read(@PathVariable("id") Long id) {
		return userRepo.findOne(id);
	}

	@GET
	@RequestMapping(method = RequestMethod.GET)
	public Users readAll() {
		final Users users = new Users();
		for (User user : userRepo.findAll()) {
			users.getUsers().add(user);
		}
		return users;
	}

	@PUT
	@RequestMapping(method = RequestMethod.PUT)
	public User update(User user) {
		return userRepo.save(user);
	}

	@DELETE
	@RequestMapping(method = RequestMethod.DELETE)
	public void delete(Long id) {
		userRepo.delete(id);
	}

}
