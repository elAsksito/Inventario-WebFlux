package com.ask.inventario.repository;

import com.ask.inventario.model.Proveedor;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface ProveedorRepository extends R2dbcRepository<Proveedor, Long> {
    Mono<Proveedor> findByNombre(String nombre);
}