package com.MattCorp.CRUD.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MattCorp.CRUD.entities.Product;
import com.MattCorp.CRUD.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository userRepository;
	
	public List<Product> buscaTudo(){
		return userRepository.findAll();
	}
	
	public Product buscaPorId(Long id) {
		Optional<Product> obj = userRepository.findById(id);
		return obj.get(); /* retorna o valor que a variavel optional recebe */
	}
	
}
