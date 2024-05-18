package com.example.trabajoPractico6.services;

import com.example.trabajoPractico6.entities.Pedido;
import com.example.trabajoPractico6.repositories.BaseRepository;
import com.example.trabajoPractico6.repositories.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido, Long> implements PedidoService {

    private PedidoRepository pedidoRepository;

    public PedidoServiceImpl(PedidoRepository pedidoRepository) {
        super((BaseRepository<Pedido, Long>) pedidoRepository);
        this.pedidoRepository = pedidoRepository;
    }
}
