package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    protected Customer() {}

    public Customer(String name, Advisor advisor) {
        this.name = name;
        this.advisor = advisor;
    }

    public Long getCustomerId() { return customerId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Advisor getAdvisor() { return advisor; }
    public void setAdvisor(Advisor advisor) { this.advisor = advisor; }
}
