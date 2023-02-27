package com.example.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.springboot.model.Privilage;

public interface PrivilageRepository extends MongoRepository<Privilage, String> {

	@Query("{name:'?0'}")
	Privilage findItemByPrivilage(String name);

}
