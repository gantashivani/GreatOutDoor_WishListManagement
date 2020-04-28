package com.cg.go.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.go.dto.ProductsDTO;

public interface ProductDAO extends JpaRepository<ProductsDTO, Integer>{

}
