package com.example.librarymanagementsystem.repository;
import com.example.librarymanagementsystem.model.Author;

import java.util.*;

public class AuthorRepository {

    private final Map<String, Author> authorStore = new HashMap<>();

    public Author save(Author author) {
        if (author == null || author.getId() == null)
            throw new IllegalArgumentException("Author and Author ID cannot be null");
        authorStore.put(author.getId(), author);
        System.out.println("Saved Author: " + author);
        return author;
    }

    public Optional<Author> findById(String id) {
        return Optional.ofNullable(authorStore.get(id));
    }

    public List<Author> findAll() {
        return new ArrayList<>(authorStore.values());
    }

    public void delete(String id) {
        Author removed = authorStore.remove(id);
        if (removed != null)
            System.out.println("Deleted Author: " + removed);
        else
            System.out.println("Author with ID " + id + " not found");
    }
}

