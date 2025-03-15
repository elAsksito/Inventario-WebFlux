package com.ask.inventario.controller;

import com.ask.inventario.model.SalidaProducto;
import com.ask.inventario.service.SalidaProductoService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/salidas")
public class SalidaProductoController {

    private final SalidaProductoService salidaProductoService;

    public SalidaProductoController(SalidaProductoService salidaProductoService) {
        this.salidaProductoService = salidaProductoService;
    }

    @PostMapping
    public Mono<SalidaProducto> registrarSalida(@RequestBody SalidaProducto salida) {
        return salidaProductoService.registrarSalida(salida);
    }

    @GetMapping("/producto/{productoId}")
    public Flux<SalidaProducto> obtenerSalidasPorProducto(@PathVariable Long productoId) {
        return salidaProductoService.obtenerSalidasPorProducto(productoId);
    }
}