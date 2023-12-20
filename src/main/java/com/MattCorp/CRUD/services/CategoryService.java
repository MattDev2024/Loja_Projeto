package com.MattCorp.CRUD.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MattCorp.CRUD.entities.Category;
import com.MattCorp.CRUD.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository userRepository;
	
	public List<Category> buscaTudo(){
		return userRepository.findAll();
	}
	
	public Category buscaPorId(Long id) {
		Optional<Category> obj = userRepository.findById(id);
		return obj.get(); /* retorna o valor que a variavel optional recebe */
	}
	
}
