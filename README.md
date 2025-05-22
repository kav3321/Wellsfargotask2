package com.yourpackage.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL)
    private List<Client> clients;

    public FinancialAdvisor() {}

    public FinancialAdvisor(String name, String email, String phone, List<Client> clients) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.clients = clients;
    }

    // Getters and setters (no setter for id)
}
