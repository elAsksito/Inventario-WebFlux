package com.ask.inventario.service;

import com.ask.inventario.model.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoService {
    Mono<Producto> crearProducto(Producto producto);

    Mono<Producto> obtenerProductoPorId(Long id);

    Flux<Producto> obtenerTodosLosProductos();

    Flux<Producto> obtenerProductosPorCategoria(String categoria);

    Mono<Void> eliminarProducto(Long id);
}