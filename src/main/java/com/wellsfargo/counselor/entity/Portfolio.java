package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.security.Security;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "client+id", nullable = false)
    private Client client;

    @OneToOne(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<Security> securities;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Portfolio(Client client, List<Security> securities,
                     LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.client = client;
        this.securities = securities;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    protected Portfolio() {

    }

    public Long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreateAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
