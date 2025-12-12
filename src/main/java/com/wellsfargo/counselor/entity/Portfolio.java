package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "clientId")
    private Client client;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double availableBalance;

    @Column(nullable = false)
    private double totalValue;

    @Column(nullable = false)
    private LocalDate createdAt;


    protected Portfolio() {
    }

    public Portfolio(Client client, String name) {
        this.client = client;
        this.name = name;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public String getName() {
        return name;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
