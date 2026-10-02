package com.thuchanhso3.bai3.repository;

import com.thuchanhso3.bai3.models.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<product, Long> {
	
}
