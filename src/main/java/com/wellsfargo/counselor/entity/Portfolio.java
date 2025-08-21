package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @ManyToOne
    private long clientId;

    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio() {}
    public Portfolio(long clientId, Date creationDate) {
        this.clientId = clientId;
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
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


}
