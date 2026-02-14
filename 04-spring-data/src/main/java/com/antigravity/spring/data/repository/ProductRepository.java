package com.antigravity.spring.data.repository;

import com.antigravity.spring.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Derived query method
    List<Product> findByNameContaining(String name);
}
