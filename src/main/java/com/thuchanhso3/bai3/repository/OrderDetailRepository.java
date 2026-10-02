package com.thuchanhso3.bai3.repository;

import com.thuchanhso3.bai3.models.orderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<orderDetail, Long> {

}
