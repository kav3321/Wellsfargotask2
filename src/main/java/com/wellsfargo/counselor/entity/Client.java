package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private LocalDate createdAt;

    /**
     * Keep track of who created the clients profile
     * **/
    @ManyToOne
    @JoinColumn(name = "createdByAdvisorId")
    private Advisor createdBy;

    /**
     * current advisor assigned to client
     */
    @ManyToOne
    @JoinColumn(name = "advisorId")
    private Advisor advisor;

    public Client(String firstName, String lastName, String address, String phone, String email, Advisor createdBy, Advisor advisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.createdAt = LocalDate.now();
        this.createdBy = createdBy;
        this.advisor = advisor;
    }

    protected Client() {
    }

    public long getClientId() {
        return clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public Advisor getCreatedBy() {
        return createdBy;
    }

    public Advisor getAdvisor() {
        return advisor;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}
