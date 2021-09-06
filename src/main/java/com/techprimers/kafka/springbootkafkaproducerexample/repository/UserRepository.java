package com.techprimers.kafka.springbootkafkaproducerexample.repository;



import com.techprimers.kafka.springbootkafkaproducerexample.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
