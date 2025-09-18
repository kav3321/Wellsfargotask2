package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne; // <-- Added this import
import jakarta.persistence.Column;   // <-- Added this import

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String portfolioType;

    @Column
    private Double balance;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false, unique = true)
    private Client client;

    // --- Constructors ---
    public Portfolio() {}

    public Portfolio(String portfolioType, Double balance, Client client) {
        this.portfolioType = portfolioType;
        this.balance = balance;
        this.client = client;
    }

    // --- Getters and Setters ---
    public Long getId() {
        return id;
    }

    public String getPortfolioType() {
        return portfolioType;
    }

    public void setPortfolioType(String portfolioType) {
        this.portfolioType = portfolioType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}