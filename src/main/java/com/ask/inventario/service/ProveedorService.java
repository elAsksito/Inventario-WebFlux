package com.ask.inventario.service;

import com.ask.inventario.model.Proveedor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProveedorService {
    Mono<Proveedor> crearProveedor(Proveedor proveedor);

    Mono<Proveedor> obtenerProveedorPorId(Long id);

    Flux<Proveedor> obtenerTodosLosProveedores();

    Mono<Void> eliminarProveedor(Long id);
}