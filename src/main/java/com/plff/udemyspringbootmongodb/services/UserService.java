package com.plff.udemyspringbootmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plff.udemyspringbootmongodb.domain.User;
import com.plff.udemyspringbootmongodb.dto.UserDTO;
import com.plff.udemyspringbootmongodb.repository.UserRepository;
import com.plff.udemyspringbootmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> user = repo.findById(id);
		
		if(!user.isPresent()) {
			throw new ObjectNotFoundException("Objeto nao encontrado");
		}
		return new User(user);
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
	}

}
