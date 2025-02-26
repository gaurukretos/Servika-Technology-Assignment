package com.servikatech.servika.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servikatech.servika.model.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}
