package com.pedro.agendamento.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ClientDTO implements Serializable {
    private String name;

    public ClientDTO() {}

    public ClientDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
