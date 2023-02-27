package com.example.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.springboot.model.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

	@Query("{name:'?0'}")
	Role findItemByRole(String name);

}
