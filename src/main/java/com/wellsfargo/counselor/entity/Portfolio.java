package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolio_id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    protected Portfolio(){

    }

    public Portfolio(long portfolio_id, Client client) {
        this.portfolio_id = portfolio_id;
        this.client = client;
    }

//    getter and setter

    public long getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(long portfolio_id) {
        this.portfolio_id = portfolio_id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
