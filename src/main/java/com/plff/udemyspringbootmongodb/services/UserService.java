package com.plff.udemyspringbootmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plff.udemyspringbootmongodb.domain.User;
import com.plff.udemyspringbootmongodb.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
		
	}

}
