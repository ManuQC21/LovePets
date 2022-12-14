package com.microservices.pet.infrastructure.repositories.impl;

import com.microservices.pet.domain.models.entities.Usuario;
import com.microservices.pet.domain.repositories.UsuarioRepository;
import com.microservices.pet.infrastructure.repositories.jpa.UsuarioJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@AllArgsConstructor
@Component
public class UsuarioRepositoryImpl implements UsuarioRepository {

    private UsuarioJpaRepository usuarioJpaRepository;

    @Override
    public Usuario save(Usuario entity) {
        return this.usuarioJpaRepository.save(entity);
    }

    @Override
    public List<Usuario> getAll() {
        return this.usuarioJpaRepository.findAll();
    }

    @Override
    public Usuario getById(Long id) {
        return this.usuarioJpaRepository.findById(id).orElseThrow(() -> new NoSuchElementException("NO " + id));
    }

    @Override
    public void deleteById(Long id) {
        this.usuarioJpaRepository.deleteById(id);
    }
}
