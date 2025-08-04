package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @OneToMany(mappedBy = "portfolioId", cascade = CascadeType.ALL, orphanRemoval = true)
    private final List<Security> securities = new ArrayList<>();

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

    public List<Security> getSecurities() {
        return securities;
    }

    public void addSecurity(Security security){
        securities.add(security);
    }

    public void removeSecurity(Security security){
        securities.remove(security);
    }
}
