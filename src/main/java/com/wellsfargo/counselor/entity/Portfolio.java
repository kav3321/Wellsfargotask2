package YOUR.PACKAGE.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(
        name = "portfolio",
        uniqueConstraints = @UniqueConstraint(name = "uq_portfolio_client", columnNames = "client_id")
)
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "portfolio_id")
    private Long id;

    // Portfolio owns FK client_id (unique => 1:1)
    @OneToOne(optional = false)
    @JoinColumn(name = "client_id", nullable = false, unique = true)
    private Client client;

    @Column(name = "portfolio_name", nullable = false)
    private String portfolioName;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Security> securities;

    protected Portfolio() {
    }

    public Portfolio(
            Client client,
            String portfolioName,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            List<Security> securities
    ) {
        this.client = client;
        this.portfolioName = portfolioName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.securities = (securities != null) ? securities : new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = (securities != null) ? securities : new ArrayList<>();
    }
}
