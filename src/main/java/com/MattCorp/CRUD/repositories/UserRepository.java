package com.MattCorp.CRUD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MattCorp.CRUD.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
