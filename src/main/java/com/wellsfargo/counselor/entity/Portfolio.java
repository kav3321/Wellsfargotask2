package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;
    @Column(nullable = false)
    private int clientId;
    @Column(nullable = false)
    private String firstName;
    @Column (nullable=false)
    private String lastName;
    @Column (nullable=false)
    private String address;
    @Column (nullable=false)
    private int phone;
    @Column(nullable=false)
    private String email;


    protected Portfolio() {


    }
    public Portfolio(int clientId, String firstName, String lastName, String address, int phone, String email){
        this.clientId=clientId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.phone=phone;
        this.email=email;
    }
    public long getPortfolioId() {
        return portfolioId;
    }
    public int getClientId(){
        return clientId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress(){
        return address;
    }
    public int getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setPhone(int phone){
        this.phone=phone;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
