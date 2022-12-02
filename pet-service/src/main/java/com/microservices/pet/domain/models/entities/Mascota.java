package com.microservices.pet.domain.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "mascota")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "raza")
    private String raza;

    @Column(name = "tamanio")
    private String tamanio;

    @Column(name = "adoptada")
    private Boolean adoptada;
}
