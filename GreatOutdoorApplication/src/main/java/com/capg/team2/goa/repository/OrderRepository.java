package com.capg.team2.goa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.team2.goa.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{

}
