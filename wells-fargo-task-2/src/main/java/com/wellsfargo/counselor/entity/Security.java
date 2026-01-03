// Security.java
package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column
    private String ticker;

    public Security(Long securityId, String name, String category, String ticker) {
        this.securityId = securityId;
        this.name = name;
        this.category = category;
        this.ticker = ticker;
    }

    protected Security() { }

    public Long getSecurityId() { return securityId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getTicker() { return ticker; }
    public void setTicker(String ticker) { this.ticker = ticker; }
}
