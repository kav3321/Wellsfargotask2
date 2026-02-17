package com.wellsfargo.counselor.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id", unique = true)
    private Client client;

    private String createdAt;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    public Portfolio() {}

    public Portfolio(Long portfolioId, Client client, String createdAt) {
        this.portfolioId = portfolioId;
        this.client = client;
        this.createdAt = createdAt;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
