package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate creationDate;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    protected Portfolio() {}

    public Portfolio(String name, Client client) {
        this.name = name;
        this.client = client;
        this.creationDate = LocalDate.now();
    }

    public Long getPortfolioId() { return portfolioId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public LocalDate getCreationDate() { return creationDate; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
}