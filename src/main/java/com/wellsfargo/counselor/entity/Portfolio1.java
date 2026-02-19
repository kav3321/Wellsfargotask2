package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Portfolio1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "creation_date")
    private LocalDate creationDate;

    // One portfolio belongs to one client (bidirectional, mapped by the client's side)
    @OneToOne(mappedBy = "portfolio")
    private Clients1 client;

    // Many-to-many relationship with Security1
    @ManyToMany
    @JoinTable(
            name = "portfolio_security",
            joinColumns = @JoinColumn(name = "portfolio_id"),
            inverseJoinColumns = @JoinColumn(name = "security_id")
    )
    private Set<Security1> securities = new HashSet<>();

    // Constructor initializing all fields (except id)
    public Portfolio1(String name, LocalDate creationDate, Clients1 client) {
        this.name = name;
        this.creationDate = creationDate;
        this.client = client;
        // securities set already initialized
    }

    protected Portfolio1() {}

    // Getters and setters (no setter for id)
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Clients1 getClient() {
        return client;
    }

    public void setClient(Clients1 client) {
        this.client = client;
    }

    public Set<Security1> getSecurities() {
        return securities;
    }

    public void setSecurities(Set<Security1> securities) {
        this.securities = securities;
    }
}