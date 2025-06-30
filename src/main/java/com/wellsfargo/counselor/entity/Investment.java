package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long investmentId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    private String name;
    private String category;
    private double amount;
    private LocalDate purchaseDate;

    // Default constructor
    public Investment() {}

    // Constructor
    public Investment(Portfolio portfolio, String name, String category, double amount, LocalDate purchaseDate) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.amount = amount;
        this.purchaseDate = purchaseDate;
    }

    // Getters
    public Long getInvestmentId() {
        return investmentId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    // Setters
    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
