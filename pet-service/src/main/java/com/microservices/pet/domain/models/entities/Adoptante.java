package com.microservices.pet.domain.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "adoptante")
public class Adoptante {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "usuario_id",
            foreignKey = @ForeignKey(name = "FK_adoptante_usuario")
    )
    private Usuario usuario;

    @Column(name = "fecha_registro")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate fechaRegistro;

}
