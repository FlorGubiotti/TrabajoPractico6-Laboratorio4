package com.example.trabajoPractico6.services;

import com.example.trabajoPractico6.entities.DetallePedido;
import com.example.trabajoPractico6.repositories.BaseRepository;
import com.example.trabajoPractico6.repositories.DetallePedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class DetallePedidoServiceImpl extends BaseServiceImpl<DetallePedido, Long> implements DetallePedidoService {

    private DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoServiceImpl(DetallePedidoRepository detallePedidoRepository) {
        super((BaseRepository<DetallePedido, Long>) detallePedidoRepository);
        this.detallePedidoRepository = detallePedidoRepository;
    }
}
