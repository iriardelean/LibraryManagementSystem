package com.example.librarymanagementsystem.repository;
import com.example.librarymanagementsystem.model.BookAuthor;

public class BookAuthorRepository extends InMemoryRepository<BookAuthor, String> {

    public BookAuthorRepository() {
        super(BookAuthor::getId);
    }
}