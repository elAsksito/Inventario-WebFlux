package com.ask.inventario.repository;

import com.ask.inventario.model.EntradaProducto;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

public interface EntradaProductoRepository extends R2dbcRepository<EntradaProducto, Long> {
    Flux<EntradaProducto> findByProductoId(Long productoId);
}