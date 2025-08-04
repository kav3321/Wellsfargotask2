package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private long portfolioId;

    @Column
    @ManyToOne
    @JoinColumn(name = "clientId",nullable = false)
    private Client clientId;

    @Column(nullable = false)
    private Date createdAt;

    @Column
    private Date updatedAt;
}
