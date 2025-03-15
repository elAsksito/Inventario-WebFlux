package com.ask.inventario.service.impl;

import com.ask.inventario.model.Proveedor;
import com.ask.inventario.repository.ProveedorRepository;
import com.ask.inventario.service.ProveedorService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    private final ProveedorRepository proveedorRepository;

    public ProveedorServiceImpl(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    @Override
    public Mono<Proveedor> crearProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public Mono<Proveedor> obtenerProveedorPorId(Long id) {
        return proveedorRepository.findById(id);
    }

    @Override
    public Flux<Proveedor> obtenerTodosLosProveedores() {
        return proveedorRepository.findAll();
    }

    @Override
    public Mono<Void> eliminarProveedor(Long id) {
        return proveedorRepository.deleteById(id);
    }
}