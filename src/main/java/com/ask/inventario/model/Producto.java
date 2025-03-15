package com.ask.inventario.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;
import jakarta.validation.constraints.*;

@Table("productos")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Producto {
    @Id
    @Column("id")
    private Long id;

    @Column("nombre")
    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombre;

    @Column("categoria")
    @NotBlank(message = "La categoría no puede estar vacía")
    private String categoria;

    @Column("stock")
    @Min(value = 0, message = "El stock no puede ser negativo")
    private int stock;

    @Column("precio")
    @NotNull(message = "El precio no puede ser nulo")
    @Min(value = 1, message = "El precio debe ser mayor a 0")
    private Double precio;

    @Column("proveedor_id")
    @NotNull(message = "El ID del proveedor es obligatorio")
    private Long proveedorId;
}