package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Clients1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique = true)
    private String email;

    private String phone;

    // Many clients belong to one advisor
    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor1 advisor;

    // One client has one portfolio
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "portfolio_id", unique = true)
    private Portfolio1 portfolio;

    // Constructor initializing all fields (except id)
    public Clients1(String firstName, String lastName, String email, String phone,
                    Advisor1 advisor, Portfolio1 portfolio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.advisor = advisor;
        this.portfolio = portfolio;
    }

    protected Clients1() {}

    // Getters and setters (no setter for id)
    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Advisor1 getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor1 advisor) {
        this.advisor = advisor;
    }

    public Portfolio1 getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio1 portfolio) {
        this.portfolio = portfolio;
    }
}