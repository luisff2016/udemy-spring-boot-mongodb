package com.plff.udemyspringbootmongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.plff.udemyspringbootmongodb.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria dos Santos", "maria@gmail.com");
		User jose = new User("1", "Jose dos Santos", "jose@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria,jose));
		return ResponseEntity.ok().body(list);
	}

}
