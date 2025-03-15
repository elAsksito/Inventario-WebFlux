package com.ask.inventario.service;

import com.ask.inventario.model.SalidaProducto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SalidaProductoService {
    Mono<SalidaProducto> registrarSalida(SalidaProducto salida);

    Flux<SalidaProducto> obtenerSalidasPorProducto(Long productoId);
}