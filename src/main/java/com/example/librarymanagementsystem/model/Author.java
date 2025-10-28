package com.example.librarymanagementsystem.model;

import java.util.List;

public class Author {
    private String Id;
    private String Name;
    private List<BookAuthor> books;

    public Author(String id, String name, List<BookAuthor> books) {
        Id = id;
        Name = name;
        this.books = books;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<BookAuthor> getBooks() {
        return books;
    }

    public void setBooks(List<BookAuthor> books) {
        this.books = books;
    }
}
