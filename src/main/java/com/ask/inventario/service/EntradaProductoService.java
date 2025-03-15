package com.ask.inventario.service;

import com.ask.inventario.model.EntradaProducto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EntradaProductoService {
    Mono<EntradaProducto> registrarEntrada(EntradaProducto entrada);

    Flux<EntradaProducto> obtenerEntradasPorProducto(Long productoId);
}