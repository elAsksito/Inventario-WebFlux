package com.ask.inventario.service.impl;

import com.ask.inventario.model.EntradaProducto;
import com.ask.inventario.repository.EntradaProductoRepository;
import com.ask.inventario.service.EntradaProductoService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EntradaProductoServiceImpl implements EntradaProductoService {

    private final EntradaProductoRepository entradaProductoRepository;

    public EntradaProductoServiceImpl(EntradaProductoRepository entradaProductoRepository) {
        this.entradaProductoRepository = entradaProductoRepository;
    }

    @Override
    public Mono<EntradaProducto> registrarEntrada(EntradaProducto entrada) {
        return entradaProductoRepository.save(entrada);
    }

    @Override
    public Flux<EntradaProducto> obtenerEntradasPorProducto(Long productoId) {
        return entradaProductoRepository.findByProductoId(productoId);
    }
}