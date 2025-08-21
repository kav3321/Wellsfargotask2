package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

public class Security {
    @Id
    private long securityId;
    @ManyToOne
    private long portfolioId;

    @Column(nullable = false)
    private String securityName;
    @Column(nullable = false)
    private String securityCategory;
    @Column(nullable = false)
    private double securityQuantity;
    @Column(nullable = false)
    private double securityPurchasePrice;
    @Column(nullable = false)
    private Date securityPurchaseDate;

    protected Security() {}

    public Security(long securityId, long portfolioId, String securityName, String securityCategory, double securityQuantity, double securityPurchasePrice, Date securityPurchaseDate) {
        this.securityId = securityId;
        this.portfolioId = portfolioId;
        this.securityName = securityName;
        this.securityCategory = securityCategory;
        this.securityQuantity = securityQuantity;
        this.securityPurchasePrice = securityPurchasePrice;
        this.securityPurchaseDate = securityPurchaseDate;
    }
    public long getSecurityId() {
        return securityId;
    }


    public long getPortfolioId() {
        return portfolioId;
    }


    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getSecurityCategory() {
        return securityCategory;
    }

    public void setSecurityCategory(String securityCategory) {
        this.securityCategory = securityCategory;
    }

    public double getSecurityQuantity() {
        return securityQuantity;
    }

    public void setSecurityQuantity(double securityQuantity) {
        this.securityQuantity = securityQuantity;
    }

    public double getSecurityPurchasePrice() {
        return securityPurchasePrice;
    }

    public void setSecurityPurchasePrice(double securityPurchasePrice) {
        this.securityPurchasePrice = securityPurchasePrice;
    }

    public Date getSecurityPurchaseDate() {
        return securityPurchaseDate;
    }

    public void setSecurityPurchaseDate(Date securityPurchaseDate) {
        this.securityPurchaseDate = securityPurchaseDate;
    }
}
