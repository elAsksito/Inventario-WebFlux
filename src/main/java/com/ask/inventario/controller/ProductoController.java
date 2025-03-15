package com.ask.inventario.controller;

import com.ask.inventario.model.Producto;
import com.ask.inventario.service.ProductoService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @PostMapping
    public Mono<Producto> crearProducto(@RequestBody Producto producto) {
        return productoService.crearProducto(producto);
    }

    @GetMapping("/{id}")
    public Mono<Producto> obtenerProducto(@PathVariable Long id) {
        return productoService.obtenerProductoPorId(id);
    }

    @GetMapping
    public Flux<Producto> listarProductos() {
        return productoService.obtenerTodosLosProductos();
    }

    @GetMapping("/categoria/{categoria}")
    public Flux<Producto> listarPorCategoria(@PathVariable String categoria) {
        return productoService.obtenerProductosPorCategoria(categoria);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> eliminarProducto(@PathVariable Long id) {
        return productoService.eliminarProducto(id);
    }
}