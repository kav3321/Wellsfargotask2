// Client.java
package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "advisor_id", nullable = false)
    private FinancialAdvisor advisor;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column
    private String email;

    @Column
    private String phone;

    @Column(nullable = false)
    private Boolean isActive;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private Portfolio portfolio;

    public Client(
            Long clientId,
            FinancialAdvisor advisor,
            String firstName,
            String lastName,
            String email,
            String phone,
            Boolean isActive,
            Portfolio portfolio
    ) {
        this.clientId = clientId;
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.isActive = (isActive != null) ? isActive : Boolean.TRUE;
        this.portfolio = portfolio;
    }

    protected Client() { }

    public Long getClientId() { return clientId; }

    public FinancialAdvisor getAdvisor() { return advisor; }
    public void setAdvisor(FinancialAdvisor advisor) { this.advisor = advisor; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public Boolean getIsActive() { return isActive; }
    public void setIsActive(Boolean active) { isActive = active; }

    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}
