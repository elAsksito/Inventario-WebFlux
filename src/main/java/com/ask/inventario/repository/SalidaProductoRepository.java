package com.ask.inventario.repository;

import com.ask.inventario.model.SalidaProducto;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

public interface SalidaProductoRepository extends R2dbcRepository<SalidaProducto, Long> {
    Flux<SalidaProducto> findByProductoId(Long productoId);
}