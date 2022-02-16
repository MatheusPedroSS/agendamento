package com.pedro.agendamento.service;

import java.util.List;
import java.util.stream.Collectors;

import com.pedro.agendamento.dto.ClientDTO;
import com.pedro.agendamento.entity.ClientEntity;
import com.pedro.agendamento.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    
    @Autowired
    private ClientRepository repository;

    public List<ClientDTO> findAll() {
        List<ClientEntity> clientList = repository.findAll();
        return clientList.stream().map(client -> new ClientDTO(client.getName())).collect(Collectors.toList());
    }

    public ClientDTO save(ClientDTO dto) {
        ClientEntity entity = repository.save(new ClientEntity(dto.getName()));
        return entity != null ? new ClientDTO(entity.getName()) : null;
    } 
}
