package com.example.librarymanagementsystem.service;

import com.example.librarymanagementsystem.model.Publication;
import com.example.librarymanagementsystem.repository.PublicationRepository;

import java.util.List;
import java.util.Optional;

public class PublicationService<T extends Publication> {

    private final PublicationRepository<T> repository;

    public PublicationService(PublicationRepository<T> repository) {
        this.repository = repository;
    }

    public T create(T entity) {
        if (entity == null)
            throw new IllegalArgumentException("Publication cannot be null");
        return repository.save(entity);
    }

    public Optional<T> findById(String id) {
        return repository.findById(id);
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public T update(T entity) {
        if (entity == null || entity.getId() == null)
            throw new IllegalArgumentException("Publication and Id cannot be null");
        return repository.save(entity);
    }

    public void delete(String id) {
        repository.delete(id);
    }
}
