package com.MattCorp.CRUD.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MattCorp.CRUD.entities.Order;
import com.MattCorp.CRUD.repositories.OrderRepository2;

@Service
public class OrderService2 {
	
	@Autowired
	private OrderRepository2 orderRepository;
	
	public List<Order> buscaTudo(){
		return orderRepository.findAll();
	}
	
	public Order buscaPorId(Long id) {
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get(); /* retorna o valor que a variavel optional recebe */
	}
	
}
