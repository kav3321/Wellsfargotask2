package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Security1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String symbol;

    @Column(nullable = false)
    private String name;

    @Column(precision = 10, scale = 2)
    private BigDecimal currentPrice;

    // Many-to-many relationship with Portfolio1
    @ManyToMany(mappedBy = "securities")
    private Set<Portfolio1> portfolios = new HashSet<>();

    // Constructor initializing all fields (except id)
    public Security1(String symbol, String name, BigDecimal currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.currentPrice = currentPrice;
        // portfolios set already initialized
    }

    protected Security1() {}

    // Getters and setters (no setter for id)
    public Long getId() {
        return id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Set<Portfolio1> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(Set<Portfolio1> portfolios) {
        this.portfolios = portfolios;
    }
}