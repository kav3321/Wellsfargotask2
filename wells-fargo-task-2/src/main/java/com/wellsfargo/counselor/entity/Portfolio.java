// Portfolio.java
package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne(optional = false)
    @JoinColumn(name = "client_id", nullable = false, unique = true)
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PortfolioHolding> holdings;

    public Portfolio(Long portfolioId, Client client, List<PortfolioHolding> holdings) {
        this.portfolioId = portfolioId;
        this.client = client;
        this.holdings = (holdings != null) ? holdings : new ArrayList<>();
    }

    protected Portfolio() { }

    public Long getPortfolioId() { return portfolioId; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    public List<PortfolioHolding> getHoldings() { return holdings; }
    public void setHoldings(List<PortfolioHolding> holdings) { this.holdings = holdings; }
}
