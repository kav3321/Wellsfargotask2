package com.wellsfargo.counselor.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {
	
	@Id
	@GeneratedValue()
	private long portfolioId;
	
	@OneToOne(optional=false)
	@JoinColumn(name="client_id", nullable=false, unique=true)
	private Client client;

	@CreationTimestamp
	@Column(nullable = false, updatable = false)
	private LocalDateTime createdAt;

	protected Portfolio() {

	}

	public Portfolio(Client client) {
		this.client = client;
	}

	public long getPortfolioId() {
		return portfolioId;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

}
