package com.ask.inventario.repository;

import com.ask.inventario.model.Producto;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoRepository extends R2dbcRepository<Producto, Long> {
    Flux<Producto> findByCategoria(String categoria);
    Mono<Producto> findByNombre(String nombre);
}