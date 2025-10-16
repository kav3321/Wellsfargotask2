package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class clientSecurityPurchase {
    @Id
    @GeneratedValue()
    private long clientSecurityPurchaseId;
    @Column(nullable=false)
    private int portfolioId;
    @Column (nullable=false)
    private int securityId;
    @Column (nullable=false)
    private String purchaseDate;
    @Column (nullable=false)
    private int quantity;
    @Column (nullable=false)
    private double price;


    protected clientSecurityPurchase() {


    }


    public clientSecurityPurchase(int portfolioId, int securityId,String purchaseDate, int quantity, double price){
        this.portfolioId=portfolioId;
        this.securityId=securityId;
        this.purchaseDate=purchaseDate;
        this.quantity=quantity;
        this.price=price;
    }


    public int getPortfolioId(){
        return portfolioId;
    }
    public int getSecurityId (){
        return securityId;
    }
    public String getPurchaseDate(){
        return purchaseDate;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
    public void setPurchaseDate (String purchaseDate){
        this.purchaseDate=purchaseDate;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public void setPrice(double price){
        this.price=price;
    }
}
