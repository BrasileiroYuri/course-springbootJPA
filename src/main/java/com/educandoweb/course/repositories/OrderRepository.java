package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

//camada de acesso a banco de dados

public interface OrderRepository extends JpaRepository<Order, Long> {

}
