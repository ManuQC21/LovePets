package com.microservices.pet.domain.repositories.base;

import java.util.List;

public interface GenericCrudRepository<T, U> {

    T save(T entity);
    List<T> getAll();
    T getById(U id);
//    T update(T entity);
    void deleteById(U id);
}
