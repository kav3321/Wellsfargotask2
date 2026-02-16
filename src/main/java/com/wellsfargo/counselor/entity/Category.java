package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Category {
	
	@Id
	@GeneratedValue()
	private long categoryId;

	@Column(nullable = false, unique = true)
	private String name;

	protected Category() {

	}

	public Category(String name) {
		this.name = name;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
