package com.app.pedidos.controllers;

import com.app.pedidos.entities.Proveedor;
import com.app.pedidos.serives.ProveedorService;
import com.app.pedidos.serives.ProveedorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/proveedores")
public class ProveedorController extends BaseControllerImpl<Proveedor, ProveedorServiceImpl> {

    @Autowired
    private ProveedorService proveedorService;
}