package com.plff.udemyspringbootmongodb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plff.udemyspringbootmongodb.domain.User;
import com.plff.udemyspringbootmongodb.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
//		User maria = new User("1", "Maria dos Santos", "maria@gmail.com");
//		User jose = new User("1", "Jose dos Santos", "jose@gmail.com");
		List<User> list = service.findAll();
//		list.addAll(Arrays.asList(maria,jose));
		return ResponseEntity.ok().body(list);
	}

}
