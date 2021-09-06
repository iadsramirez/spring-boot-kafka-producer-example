package com.techprimers.kafka.springbootkafkaproducerexample.resource;

import com.techprimers.kafka.springbootkafkaproducerexample.model.User;
import com.techprimers.kafka.springbootkafkaproducerexample.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResource {

	@Autowired
	private KafkaTemplate<String, User> userKafkaTemplate;
	@Autowired
	private UserService service;
	
	private static final String TOPIC = "Kafka_Example";
	
	
	@PostMapping("/prueba")
	public String postUsuario(@RequestBody User user) {
		service.guardar(user);
		userKafkaTemplate.send(TOPIC,user);
		return "Probando Mandar usuario completo";
	}

}
