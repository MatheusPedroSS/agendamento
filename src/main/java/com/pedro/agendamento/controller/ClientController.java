package com.pedro.agendamento.controller;

import java.util.List;

import com.pedro.agendamento.dto.ClientDTO;
import com.pedro.agendamento.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("client")
public class ClientController {
    
    @Autowired
    private ClientService service;

    @GetMapping
    public List<ClientDTO> getAll() {
        return service.findAll();
    }

    @PostMapping
    public ClientDTO save(@RequestBody ClientDTO dto) {
        return service.save(dto);
    }
    
}
