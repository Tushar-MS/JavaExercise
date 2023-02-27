package com.example.springboot;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.springboot.model.Privilage;
import com.example.springboot.model.Role;
import com.example.springboot.model.User;
import com.example.springboot.repository.PrivilageRepository;
import com.example.springboot.repository.RoleRepository;
import com.example.springboot.repository.UserRepository;

@SpringBootApplication
@EnableMongoRepositories
public class MdSpringBootApplication implements CommandLineRunner{


	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	PrivilageRepository privilageRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MdSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		createUserRoles();
	}
	
	//CREATE
	void createUserRoles() {
		System.out.println("Data creation started...");
		savePrivilage();
		saveRole();
		saveUser();
		System.out.println("Data creation complete...");
	}
	
	
	private void saveUser() {
		
		 User user1 = getUser("Alpha");
		 Set<Role> roles = new HashSet();
		 roles.add(getRole("scrum"));
		 roles.add(getRole("manager"));
		 user1.setRoles(roles);
		 userRepository.save(user1);
		 
		 User user2 = getUser("Beta");;
		 roles = new HashSet();
		 roles.add(getRole("developer"));
		 user2.setRoles(roles);
		 userRepository.save(user2);
		 
		 userRepository.save(getUser("Gamma"));
	}
	
	private void saveRole() {
		Set<Privilage> privilages = new HashSet();
		privilages.add(getPrivilage("HR"));
		
		Role role1 = getRole("scrum");
		role1.setPrivilage(privilages);
		roleRepository.save(role1);
		
		Role role2= getRole("developer");
		privilages = new HashSet();
		privilages.add(getPrivilage("IT"));
		role2.setPrivilage(privilages);
		roleRepository.save(role2);
		
		Role role3 = getRole("manager");
		privilages = new HashSet();
		privilages.add(getPrivilage("Management"));
		role3.setPrivilage(privilages);
		roleRepository.save(role3);
		
	}
	
	private void savePrivilage() {
		privilageRepository.save(getPrivilage("HR"));
		privilageRepository.save(getPrivilage("Management"));
		privilageRepository.save(getPrivilage("IT"));
	}
	
	private Privilage getPrivilage(String name) {
		Privilage privilage = null;
		if(name.equalsIgnoreCase("HR")) {
			privilage =  new Privilage("1","HR","HR");
		} else if(name.equalsIgnoreCase("Management")) {
			privilage = new Privilage("2","Management","Management");
		}else if(name.equalsIgnoreCase("IT")) {
			privilage = new Privilage("3","IT","Software");
		}
		return privilage;
	}
	
	
	private Role getRole(String name) {
		Role role = null;
		if(name.equalsIgnoreCase("scrum")) {
			 role =  new Role("1","scrum master");
		} else if(name.equalsIgnoreCase("developer")) {
			role = new Role("2","developer");
		}else if(name.equalsIgnoreCase("manager")){
			role = new Role("3","manager");
		}
		return role;
	}
	
	private User getUser(String name) {
		User user = null;
		if(name.equalsIgnoreCase("Alpha")) {
			 user = new User("1","Alpha","aplha@abc.com");
		} else if(name.equalsIgnoreCase("Beta")) {
			 user = new User("2","Beta","beta@abc.com");
		}else if(name.equalsIgnoreCase("Gamma")){
			user = new User("3","Gamma","gamma@abc.com");
		}
		return user;
	}
}
