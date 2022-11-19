package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;

//camada de acesso a banco de dados

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	 
	
}
