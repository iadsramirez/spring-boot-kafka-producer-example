package com.techprimers.kafka.springbootkafkaproducerexample.service;

import com.techprimers.kafka.springbootkafkaproducerexample.model.User;

public interface UserService {

	public User findUserById(Integer id);
	public User guardar(User user);
}
