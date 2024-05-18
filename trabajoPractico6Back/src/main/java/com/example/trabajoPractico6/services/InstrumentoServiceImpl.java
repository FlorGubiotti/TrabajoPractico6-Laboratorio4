package com.example.trabajoPractico6.services;

import com.example.trabajoPractico6.entities.Instrumento;
import com.example.trabajoPractico6.repositories.BaseRepository;
import com.example.trabajoPractico6.repositories.InstrumentoRepository;
import org.springframework.stereotype.Service;

@Service
public class InstrumentoServiceImpl extends BaseServiceImpl<Instrumento, Long> implements InstrumentoService {

    private InstrumentoRepository instrumentoRepository;

    public InstrumentoServiceImpl(InstrumentoRepository instrumentoRepository) {
        super((BaseRepository<Instrumento, Long>) instrumentoRepository);
        this.instrumentoRepository = instrumentoRepository;
    }
}
