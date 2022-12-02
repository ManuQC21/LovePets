package com.microservices.pet.domain.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "usuario_id",
            foreignKey = @ForeignKey(name = "FK_admin_usuario")
    )
    private Usuario usuario;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "dni", unique = true)
    private String dni;

}
