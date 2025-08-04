package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Security {
    @Id
    @GeneratedValue
    private long securityId;

    @Column(nullable = false)
    private final String category;

    @Column(nullable = false)
    private final String quantity;

    @Column(nullable = false)
    private final Date purchaseDate;

    @Column(nullable = false)
    private double purchasePrice;

    @Column
    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolioId;

    public Security(long securityId, String category, String quantity, Date purchaseDate, double purchasePrice, Portfolio portfolioId) {
        this.securityId = securityId;
        this.category = category;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.portfolioId = portfolioId;
    }

    public long getSecurityId() {
        return securityId;
    }

    public String getCategory() {
        return category;
    }

    public String getQuantity() {
        return quantity;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public Portfolio getPortfolioId() {
        return portfolioId;
    }
}
