package com.thuchanhso3.bai3.repository;

import com.thuchanhso3.bai3.models.order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<order, Long> {

}
