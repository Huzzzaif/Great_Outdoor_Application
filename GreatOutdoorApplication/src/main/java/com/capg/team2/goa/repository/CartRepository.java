package com.capg.team2.goa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.team2.goa.entity.CartitemEntity;

public interface CartRepository extends JpaRepository<CartitemEntity, Integer> {

}
