package com.ask.inventario.controller;

import com.ask.inventario.model.EntradaProducto;
import com.ask.inventario.service.EntradaProductoService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/entradas")
public class EntradaProductoController {

    private final EntradaProductoService entradaProductoService;

    public EntradaProductoController(EntradaProductoService entradaProductoService) {
        this.entradaProductoService = entradaProductoService;
    }

    @PostMapping
    public Mono<EntradaProducto> registrarEntrada(@RequestBody EntradaProducto entrada) {
        return entradaProductoService.registrarEntrada(entrada);
    }

    @GetMapping("/producto/{productoId}")
    public Flux<EntradaProducto> obtenerEntradasPorProducto(@PathVariable Long productoId) {
        return entradaProductoService.obtenerEntradasPorProducto(productoId);
    }
}