package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Securities {

    @Id
    @Column(nullable = false)
    private long securityId;

    @ManyToOne
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private long quantity;

    public Securities() {
    }

    public Securities(String name, String category, String purchaseDate, String purchasePrice, long quantity) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public long getQuantity() {
        return quantity;
    }
}
