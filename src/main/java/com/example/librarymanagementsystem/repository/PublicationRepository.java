package com.example.librarymanagementsystem.repository;
import com.example.librarymanagementsystem.model.Publication;

import java.util.*;


public abstract class PublicationRepository<T extends Publication> {

    private Map<String, T> publicationStore = new HashMap<>();

    public T save(T entity) {
        if (entity == null || entity.getId() == null)
            throw new IllegalArgumentException("Entity and Entity ID cannot be null");
        publicationStore.put(entity.getId(), entity);
        System.out.println("Saved to " + this.getClass().getSimpleName() + ": " + entity);
        return entity;
    }

    public Optional<T> findById(String id) {
        return Optional.ofNullable(publicationStore.get(id));
    }

    public List<T> findAll() {
        return new ArrayList<>(publicationStore.values());
    }

    public void delete(String id) {
        T removedEntity = publicationStore.remove(id);
        if (removedEntity != null)
            System.out.println("Deleted from " + this.getClass().getSimpleName() + ": " + removedEntity);
        else
            System.out.println("Could not find entity with id: " + id);
    }
}
