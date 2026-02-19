package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne
    private Client client;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String baseCurrency;

    @Column(nullable = false)
    private Date createdAt;

    @Column(nullable = false)
    private Date updatedAt;

    public Portfolio() {

    }

    public Portfolio(Client client, String name, String baseCurrency, Date createdAt, Date updatedAt) {
        this.client = client;
        this.name = name;
        this.baseCurrency = baseCurrency;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
