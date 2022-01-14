package com.manfactory.dsmovie.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.manfactory.dsmovie.entities.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Long>{
	
	User findByEmail(String email);	
}
