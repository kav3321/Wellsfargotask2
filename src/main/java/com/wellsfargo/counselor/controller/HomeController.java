package com.wellsfargo.counselor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Portfolio Management System API - Available endpoints: /api/clients, /api/portfolios, /api/securities, /h2-console";
    }
}