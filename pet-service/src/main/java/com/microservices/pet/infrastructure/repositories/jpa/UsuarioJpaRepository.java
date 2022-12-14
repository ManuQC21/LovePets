package com.microservices.pet.infrastructure.repositories.jpa;

import com.microservices.pet.domain.models.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
public interface UsuarioJpaRepository extends JpaRepository<Usuario, Long> {
=======
import java.util.Optional;

public interface UsuarioJpaRepository extends JpaRepository<Usuario, Long> {
    Usuario getByEmail(String email);
>>>>>>> 203310abeb0059f3056c70490ce07963e6bd253c
}
