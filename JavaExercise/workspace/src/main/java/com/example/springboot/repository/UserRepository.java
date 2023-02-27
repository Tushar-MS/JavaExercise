package com.example.springboot.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.springboot.model.User;

public interface UserRepository extends MongoRepository<User, String> {

	@Query("{name:'?0'}")
	User findItemByUser(String name);
}
