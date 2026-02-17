package com.wellsfargo.counselor.models;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;

    public Client() {}

    public Client(Long clientId, FinancialAdvisor advisor, String firstName,
                  String lastName, String email, String phone) {
        this.clientId = clientId;
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public Long getClientId() {
        return clientId;
    }

    public FinancialAdvisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(FinancialAdvisor advisor) {
        this.advisor = advisor;
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

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
