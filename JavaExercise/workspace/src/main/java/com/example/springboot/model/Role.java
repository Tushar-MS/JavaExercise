package com.example.springboot.model;

import java.util.Set;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "role")
public class Role {
	
	@Id
    private String id;

    private String name;

    @DBRef
    Set<Privilage> privilage;

	
	public Role(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Privilage> getPrivilage() {
		return privilage;
	}

	public void setPrivilage(Set<Privilage> privilage) {
		this.privilage = privilage;
	}
    
    
    
}
