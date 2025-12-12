package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private int quantity;

    protected Security() {
    }

    public Security(Portfolio portfolio, String name, double purchasePrice, int quantity, String category) {
        this.portfolio = portfolio;
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.category = category;
        this.purchaseDate= LocalDate.now();
    }

    public long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public String getName() {
        return name;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public void setName(String portfolioName) {
        this.name = portfolioName;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
