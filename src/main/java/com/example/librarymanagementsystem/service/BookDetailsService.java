package com.example.librarymanagementsystem.service;

import com.example.librarymanagementsystem.model.BookDetails;
import com.example.librarymanagementsystem.repository.BookDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookDetailsService {

    private final BookDetailsRepository repository;

    public BookDetailsService(BookDetailsRepository repository) {
        this.repository = repository;
    }

    public BookDetailsService() {
        this(new BookDetailsRepository());
    }

    public BookDetails create(BookDetails entity) {
        if (entity == null)
            throw new IllegalArgumentException("BookDetails cannot be null");
        return repository.save(entity);
    }

    public Optional<BookDetails> findById(String id) {
        return repository.findById(id);
    }

    public List<BookDetails> findAll() {
        return repository.findAll();
    }

    public BookDetails update(BookDetails entity) {
        if (entity == null || entity.getId() == null)
            throw new IllegalArgumentException("BookDetails and Id cannot be null");
        return repository.save(entity);
    }

    public void delete(String id) {
        repository.delete(id);
    }
}
