package com.plff.udemyspringbootmongodb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.plff.udemyspringbootmongodb.domain.User;
import com.plff.udemyspringbootmongodb.repository.UserRepository;

@Configuration
public class Instantiantion implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		//apagar os dados no banco
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria dos Santos", "maria@gmail.com");
		User jose = new User(null, "Jose dos Santos", "jose@gmail.com");
		User luis = new User(null, "Luis de Jesus", "luis@gmail.com");
		User fernando = new User(null, "Fernando de Jesus", "fernando@gmail.com");
		
		userRepository.save(maria);
		userRepository.save(jose);
		userRepository.save(luis);
		userRepository.save(fernando);
		
		
		
	}

}
