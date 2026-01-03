// FinancialAdvisor.java
package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Client> clients;

    public FinancialAdvisor(Long advisorId, String firstName, String lastName, String email, List<Client> clients) {
        this.advisorId = advisorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.clients = (clients != null) ? clients : new ArrayList<>();
    }

    protected FinancialAdvisor() { }

    public Long getAdvisorId() { return advisorId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<Client> getClients() { return clients; }
    public void setClients(List<Client> clients) { this.clients = clients; }
}
