package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false, unique = true)
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<PortfolioHolding> holdings;

    public Portfolio() {}

    public Portfolio(Long portfolioId, Client client, List<PortfolioHolding> holdings) {
        this.portfolioId = portfolioId;
        this.client = client;
        this.holdings = holdings;
    }

    public Long getPortfolioId() { return portfolioId; }
    public Client getClient() { return client; }
    public List<PortfolioHolding> getHoldings() { return holdings; }

    public void setClient(Client client) { this.client = client; }
    public void setHoldings(List<PortfolioHolding> holdings) { this.holdings = holdings; }
}
