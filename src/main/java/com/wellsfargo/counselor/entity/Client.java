package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Client {
    @Id
    @GeneratedValue()
    private long clientId;
    @Column(nullable = false)
    private int advisorId;
    @Column(nullable = false)
    private String createdAt;
    @Column(nullable = false)
    private String updatedAt;
    @Column (nullable = false)
    private String deletedAt;


    protected Client(){


    }
    public Client(int advisorId, String createdAt, String updatedAt, String deletedAt) {
        this.advisorId = advisorId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }
    public long getClientId() {
        return clientId;
    }
    public int getAdvisorId() {
        return advisorId;
    }
    public String getCreatedAt(){
        return createdAt;
    }
    public String getDeletedAt(){
        return deletedAt;
    }
    public String getUpdatedAt(){
        return updatedAt;
    }
    public void setCreatedAt (String createdAt){
        this.createdAt = createdAt;
    }
    public void setUpdatedAt (String updatedAt){
        this.updatedAt = updatedAt;
    }
    public void deletedAt (String deletedAt){
        this.deletedAt = deletedAt;
    }
}
