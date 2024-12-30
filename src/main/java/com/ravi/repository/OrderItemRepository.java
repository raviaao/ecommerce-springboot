package com.ravi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
