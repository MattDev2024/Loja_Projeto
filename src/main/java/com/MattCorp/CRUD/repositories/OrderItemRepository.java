package com.MattCorp.CRUD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MattCorp.CRUD.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
