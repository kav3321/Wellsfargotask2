package com.wellsfargo.counselor.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {
	
	@Id
	@GeneratedValue()
	private long securityId;

	@ManyToOne(optional=false)
	@JoinColumn(name="portfolio_id", nullable=false)
	private Portfolio portfolio;

	@Column(nullable = false)
	private String name;

	@ManyToOne(optional=false)
	@JoinColumn(name="category_id", nullable=false)
	private Category category;

	@Column(nullable = false)
	private LocalDate purchaseDate;

	@Column(nullable = false)
	private BigDecimal purchasePrice;

	@Column(nullable = false)
	private int quantity;

	protected Security() {

	}

	public Security(Portfolio portfolio, String name, Category category, LocalDate purchaseDate, BigDecimal purchasePrice, int quantity) {
		this.portfolio = portfolio;
		this.name = name;
		this.category = category;
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
		this.quantity = quantity;
	}

	public long getSecurityId() {
		return securityId;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


}
