package com.example.trabajoPractico6.controllers;

import com.example.trabajoPractico6.entities.Pedido;
import com.example.trabajoPractico6.services.PedidoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/pedido")
public class PedidoController extends  BaseControllerImpl<Pedido, PedidoServiceImpl>{

    private PedidoServiceImpl service;
    public PedidoController(PedidoServiceImpl service) {
        super(service);
    }
}