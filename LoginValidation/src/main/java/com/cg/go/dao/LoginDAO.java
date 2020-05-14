package com.cg.go.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.go.entity.UserDTO;

@Repository
public interface LoginDAO extends JpaRepository<UserDTO,Integer> {

}
