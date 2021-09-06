package com.techprimers.kafka.springbootkafkaproducerexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techprimers.kafka.springbootkafkaproducerexample.model.User;
import com.techprimers.kafka.springbootkafkaproducerexample.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findUserById(Integer id) {
		return null;
	}
	
	


	@Override
	public User guardar(User user) {
	    User usuario=user;		
		return userRepository.save(usuario);

	}
	

}
