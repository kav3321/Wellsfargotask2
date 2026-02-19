package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Advisor1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private String phone;

    // One advisor can have many clients
    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Clients1> clients = new HashSet<>();

    // Constructor initializing all fields (except id)
    public Advisor1(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        // clients set is already initialized
    }

    protected Advisor1() {}

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

    public Set<Clients1> getClients() {
        return clients;
    }

    public void setClients(Set<Clients1> clients) {
        this.clients = clients;
    }
}