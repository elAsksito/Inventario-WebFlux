package com.ask.inventario.service.impl;

import com.ask.inventario.model.Producto;
import com.ask.inventario.repository.ProductoRepository;
import com.ask.inventario.service.ProductoService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public Mono<Producto> crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Mono<Producto> obtenerProductoPorId(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public Flux<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Flux<Producto> obtenerProductosPorCategoria(String categoria) {
        return productoRepository.findByCategoria(categoria);
    }

    @Override
    public Mono<Void> eliminarProducto(Long id) {
        return productoRepository.deleteById(id);
    }
}