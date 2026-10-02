package com.thuchanhso3.bai3.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class sinhVien {
	@Entity
	@Table(name = "categories")
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public class category {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false, length = 100)
	    private String name;

	    // Quan hệ 1 - Nhiều: Một Category có nhiều Product
	    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	    private List<product> products;
	}
}
