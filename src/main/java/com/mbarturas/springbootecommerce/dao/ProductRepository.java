package com.mbarturas.springbootecommerce.dao;

import com.mbarturas.springbootecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
