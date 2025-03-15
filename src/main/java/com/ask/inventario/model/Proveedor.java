package com.ask.inventario.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;
import jakarta.validation.constraints.*;

@Table("proveedores")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Proveedor {
    @Id
    @Column("id")
    private Long id;

    @Column("nombre")
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @Column("contacto")
    @NotBlank(message = "El contacto es obligatorio")
    private String contacto;
}