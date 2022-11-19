package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

//camada de acesso a banco de dados

public interface UserRepository extends JpaRepository<User, Long> {
	 
	
}
