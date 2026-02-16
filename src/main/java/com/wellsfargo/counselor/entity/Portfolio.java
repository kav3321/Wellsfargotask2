package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne
    private long clientId;

    @Column(nullable = false)
    private Date creationDate;

    public Portfolio() {
    }

    public Portfolio(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public long getClientId() {
        return clientId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

}
