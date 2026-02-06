package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    private String tickerSymbol;

    @OneToMany(mappedBy = "security")
    private List<PortfolioHolding> holdings;

    public Security() {}

    public Security(Long securityId, String name, String category, String tickerSymbol, List<PortfolioHolding> holdings) {
        this.securityId = securityId;
        this.name = name;
        this.category = category;
        this.tickerSymbol = tickerSymbol;
        this.holdings = holdings;
    }

    public Long getSecurityId() { return securityId; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getTickerSymbol() { return tickerSymbol; }
    public List<PortfolioHolding> getHoldings() { return holdings; }

    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setTickerSymbol(String tickerSymbol) { this.tickerSymbol = tickerSymbol; }
    public void setHoldings(List<PortfolioHolding> holdings) { this.holdings = holdings; }
}
