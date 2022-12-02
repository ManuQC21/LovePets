package com.microservices.pet.domain.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "perfil_adoptante")
public class PerfilAdoptante {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "adoptante_id",
            foreignKey = @ForeignKey(name = "FK_perfil_adoptante")
    )
    private Adoptante adoptante;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "edad")
    private String edad;

    @Column(name = "dni")
    private String dni;

    @Column(name = "celular")
    private String celular;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "correo")
    private String correo;

}
