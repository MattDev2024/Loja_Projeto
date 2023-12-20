package com.MattCorp.CRUD.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MattCorp.CRUD.entities.Order;
import com.MattCorp.CRUD.services.OrderService2;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource2 {
	@Autowired
	private OrderService2 service;
	
	@GetMapping
	public ResponseEntity<List<Order>> finAll(){
		/* response retorna o tipo do objeto user */
		List<Order> list = service.buscaTudo();
		return ResponseEntity.ok().body(list);	
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Order> findByID(@PathVariable Long id){
		Order obj = service.buscaPorId(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
	

}
