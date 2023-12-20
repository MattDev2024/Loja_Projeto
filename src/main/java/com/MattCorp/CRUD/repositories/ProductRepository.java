package com.MattCorp.CRUD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MattCorp.CRUD.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
