package com.wellsfargo.counselor.service;

import com.wellsfargo.counselor.entity.Security;
import java.util.List;

public interface SecurityService {
    List<Security> getAllSecurities();
    Security createSecurity(Security security);
    Security getSecurityBySymbol(String symbol);
}