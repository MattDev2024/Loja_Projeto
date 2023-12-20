package com.MattCorp.CRUD.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MattCorp.CRUD.entities.Product;
import com.MattCorp.CRUD.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> finAll(){
		/* response retorna o tipo do objeto user */
		List<Product> list = service.buscaTudo();
		return ResponseEntity.ok().body(list);	
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Product> findByID(@PathVariable Long id){
		Product obj = service.buscaPorId(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
	

}
