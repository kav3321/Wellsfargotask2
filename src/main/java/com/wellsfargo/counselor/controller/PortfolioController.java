package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.entity.*;
import com.wellsfargo.counselor.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/portfolios")
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping
    public List<Portfolio> getAllPortfolios() {
        return portfolioService.getAllPortfolios();
    }

    @GetMapping("/client/{clientId}")
    public List<Portfolio> getPortfoliosByClient(@PathVariable Long clientId) {
        return portfolioService.getPortfoliosByClient(clientId);
    }

    @PostMapping
    public Portfolio createPortfolio(@RequestBody Portfolio portfolio) {
        return portfolioService.createPortfolio(portfolio);
    }

    @GetMapping("/{portfolioId}/holdings")
    public List<PortfolioSecurity> getPortfolioHoldings(@PathVariable Long portfolioId) {
        return portfolioService.getPortfolioHoldings(portfolioId);
    }
}