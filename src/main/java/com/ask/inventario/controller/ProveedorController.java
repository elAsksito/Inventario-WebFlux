package com.ask.inventario.controller;

import com.ask.inventario.model.Proveedor;
import com.ask.inventario.service.ProveedorService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

    private final ProveedorService proveedorService;

    public ProveedorController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    @PostMapping
    public Mono<Proveedor> crearProveedor(@RequestBody Proveedor proveedor) {
        return proveedorService.crearProveedor(proveedor);
    }

    @GetMapping("/{id}")
    public Mono<Proveedor> obtenerProveedor(@PathVariable Long id) {
        return proveedorService.obtenerProveedorPorId(id);
    }

    @GetMapping
    public Flux<Proveedor> listarProveedores() {
        return proveedorService.obtenerTodosLosProveedores();
    }

    @DeleteMapping("/{id}")
    public Mono<Void> eliminarProveedor(@PathVariable Long id) {
        return proveedorService.eliminarProveedor(id);
    }
}