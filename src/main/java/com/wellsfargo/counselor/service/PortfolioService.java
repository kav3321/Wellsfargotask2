package com.wellsfargo.counselor.service;

import com.wellsfargo.counselor.entity.*;
import java.util.List;

public interface PortfolioService {
    List<Portfolio> getAllPortfolios();
    List<Portfolio> getPortfoliosByClient(Long clientId);
    Portfolio createPortfolio(Portfolio portfolio);
    List<PortfolioSecurity> getPortfolioHoldings(Long portfolioId);
}