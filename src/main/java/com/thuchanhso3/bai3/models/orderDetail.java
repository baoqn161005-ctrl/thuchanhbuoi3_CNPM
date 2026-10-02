package com.thuchanhso3.bai3.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class orderDetail {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer quantity; 

    @Column(nullable = false)
    private Double price; 

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private order order;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private product product;
}
