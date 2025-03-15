package com.ask.inventario.service.impl;

import com.ask.inventario.model.SalidaProducto;
import com.ask.inventario.repository.SalidaProductoRepository;
import com.ask.inventario.service.SalidaProductoService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SalidaProductoServiceImpl implements SalidaProductoService {

    private final SalidaProductoRepository salidaProductoRepository;

    public SalidaProductoServiceImpl(SalidaProductoRepository salidaProductoRepository) {
        this.salidaProductoRepository = salidaProductoRepository;
    }

    @Override
    public Mono<SalidaProducto> registrarSalida(SalidaProducto salida) {
        return salidaProductoRepository.save(salida);
    }

    @Override
    public Flux<SalidaProducto> obtenerSalidasPorProducto(Long productoId) {
        return salidaProductoRepository.findByProductoId(productoId);
    }
}