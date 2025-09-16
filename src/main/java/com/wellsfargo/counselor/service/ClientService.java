package com.wellsfargo.counselor.service;

import com.wellsfargo.counselor.entity.Client;
import java.util.List;

public interface ClientService {
    List<Client> getAllClients();
    List<Client> getClientsByAdvisor(Long advisorId);
    Client createClient(Client client);
}