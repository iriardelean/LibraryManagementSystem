package com.example.librarymanagementsystem.repository;
import com.example.librarymanagementsystem.model.BookAuthor;

import java.util.*;

public class BookAuthorRepository {
    private final Map<String, BookAuthor> bookAuthorStore = new HashMap<>();

    public BookAuthor save(BookAuthor entity) {
        if (entity == null || entity.getId() == null)
            throw new IllegalArgumentException("BookAuthor and ID cannot be null");
        bookAuthorStore.put(entity.getId(), entity);
        System.out.println("Saved BookAuthor: " + entity);
        return entity;
    }

    public Optional<BookAuthor> findById(String id) {
        return Optional.ofNullable(bookAuthorStore.get(id));
    }

    public List<BookAuthor> findAll() {
        return new ArrayList<>(bookAuthorStore.values());
    }

    public void delete(String id) {
        BookAuthor removed = bookAuthorStore.remove(id);
        if (removed != null)
            System.out.println("Deleted BookAuthor: " + removed);
        else
            System.out.println("Could not find BookAuthor with id: " + id);
    }

}
