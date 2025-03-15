package com.ask.inventario.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;
import java.time.LocalDateTime;
import jakarta.validation.constraints.*;

@Table("entradas_productos")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class EntradaProducto {
    @Id
    @Column("id")
    private Long id;

    @Column("producto_id")
    @NotNull(message = "El ID del producto es obligatorio")
    private Long productoId;

    @Column("cantidad")
    @Min(value = 1, message = "La cantidad debe ser mayor a 0")
    private int cantidad;

    @Column("fecha")
    private LocalDateTime fecha = LocalDateTime.now();
}