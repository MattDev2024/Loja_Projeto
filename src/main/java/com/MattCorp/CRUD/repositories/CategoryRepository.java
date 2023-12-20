package com.MattCorp.CRUD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MattCorp.CRUD.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
