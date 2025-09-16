package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.entity.PortfolioSecurity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PortfolioSecurityRepository extends JpaRepository<PortfolioSecurity, Long> {
    List<PortfolioSecurity> findByPortfolioPortfolioId(Long portfolioId);
}