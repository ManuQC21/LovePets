package com.microservices.pet.domain.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "favorito")
public class Favorito {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "mascota_id",
            foreignKey = @ForeignKey(name = "FK_favorito_mascota")
    )
    private Mascota mascota;

    @ManyToOne
    @JoinColumn(
            name = "adoptante_id",
            foreignKey = @ForeignKey(name = "FK_favorito_adoptante")
    )
    private Adoptante adoptante;

}
