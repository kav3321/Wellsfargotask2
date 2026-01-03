// PortfolioHolding.java
package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class PortfolioHolding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long holdingId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    @ManyToOne(optional = false)
    @JoinColumn(name = "security_id", nullable = false)
    private Security security;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false, precision = 19, scale = 4)
    private BigDecimal purchasePrice;

    @Column(nullable = false, precision = 19, scale = 4)
    private BigDecimal quantity;

    public PortfolioHolding(
            Long holdingId,
            Portfolio portfolio,
            Security security,
            LocalDate purchaseDate,
            BigDecimal purchasePrice,
            BigDecimal quantity
    ) {
        this.holdingId = holdingId;
        this.portfolio = portfolio;
        this.security = security;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    protected PortfolioHolding() { }

    public Long getHoldingId() { return holdingId; }

    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }

    public Security getSecurity() { return security; }
    public void setSecurity(Security security) { this.security = security; }

    public LocalDate getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(LocalDate purchaseDate) { this.purchaseDate = purchaseDate; }

    public BigDecimal getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(BigDecimal purchasePrice) { this.purchasePrice = purchasePrice; }

    public BigDecimal getQuantity() { return quantity; }
    public void setQuantity(BigDecimal quantity) { this.quantity = quantity; }
}
