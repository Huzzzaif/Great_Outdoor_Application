package com.capg.team2.goa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.team2.goa.entity.Userdata;

public interface UserRepository extends JpaRepository<Userdata, String>{

}
