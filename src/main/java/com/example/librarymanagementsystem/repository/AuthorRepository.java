package com.example.librarymanagementsystem.repository;
import com.example.librarymanagementsystem.model.Author;

import java.util.function.Function;
public class AuthorRepository extends InMemoryRepository<Author, String> {

    public AuthorRepository() {
        super(Author::getId);
    }
}

