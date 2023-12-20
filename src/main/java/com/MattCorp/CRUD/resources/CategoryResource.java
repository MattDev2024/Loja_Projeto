package com.MattCorp.CRUD.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MattCorp.CRUD.entities.Category;
import com.MattCorp.CRUD.services.CategoryService;



@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> finAll(){
		/* response retorna o tipo do objeto user */
		List<Category> list = service.buscaTudo();
		return ResponseEntity.ok().body(list);	
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Category> findByID(@PathVariable Long id){
		Category obj = service.buscaPorId(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
	

}
