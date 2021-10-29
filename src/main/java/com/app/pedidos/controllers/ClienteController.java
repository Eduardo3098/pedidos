package com.app.pedidos.controllers;

import com.app.pedidos.entities.Cliente;
import com.app.pedidos.serives.ClienteService;
import com.app.pedidos.serives.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/clientes")
public class ClienteController extends BaseControllerImpl<Cliente, ClienteServiceImpl> {

    @Autowired
    private ClienteService clienteService;
}