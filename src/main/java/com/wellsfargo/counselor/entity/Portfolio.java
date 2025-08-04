package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private long portfolioId;

    @Column
    @ManyToOne
    @JoinColumn(name = "clientId",nullable = false)
    private Client clientId;

    @Column(nullable = false)
    private final Date createdAt;

    @Column
    private Date updatedAt;

    public Portfolio(long portfolioId, Client clientId, Date createdAt){
        this.portfolioId = portfolioId;
        this.clientId = clientId;
        this.createdAt = createdAt;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
