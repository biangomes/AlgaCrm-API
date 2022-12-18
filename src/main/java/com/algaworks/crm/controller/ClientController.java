package com.algaworks.crm.controller;

import com.algaworks.crm.model.Client;
import com.algaworks.crm.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientController {

    // Injecao de dependencia
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public List<Client> listar() {
        return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client adicionar(@RequestBody Client client) {
        return clientRepository.save(client);
    }
}
