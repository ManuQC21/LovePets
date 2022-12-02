package com.microservices.pet.domain.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "voluntario")
public class Voluntario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "admin_id",
            foreignKey = @ForeignKey(name = "FK_voluntario_admin")
    )
    private Admin admin;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "edad")
    private Long edad;

    @Column(name = "dni", unique = true)
    private String dni;

    @Column(name = "celular")
    private String celular;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "correo")
    private String correo;

    @Column(name = "fecha_registro")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate fechaRegistro;

}
