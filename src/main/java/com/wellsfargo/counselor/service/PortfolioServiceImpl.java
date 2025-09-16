package com.wellsfargo.counselor.service;

import com.wellsfargo.counselor.entity.*;
import com.wellsfargo.counselor.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PortfolioServiceImpl implements PortfolioService {

    @Autowired
    private PortfolioRepository portfolioRepository;
    
    @Autowired
    private PortfolioSecurityRepository portfolioSecurityRepository;

    @Override
    public List<Portfolio> getAllPortfolios() {
        return portfolioRepository.findAll();
    }

    @Override
    public List<Portfolio> getPortfoliosByClient(Long clientId) {
        return portfolioRepository.findByClientClientId(clientId);
    }

    @Override
    public Portfolio createPortfolio(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }

    @Override
    public List<PortfolioSecurity> getPortfolioHoldings(Long portfolioId) {
        return portfolioSecurityRepository.findByPortfolioPortfolioId(portfolioId);
    }
}