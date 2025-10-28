package com.example.librarymanagementsystem.model;


import java.util.ArrayList;
import java.util.List;

public class BookDetails extends Publication {
    private List<BookAuthor> bookAuthors;

    public BookDetails(String id, String title) {
        super(id, title);
        this.bookAuthors = new ArrayList<>();
    }

    public List<BookAuthor> getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(List<BookAuthor> bookAuthors) {
        bookAuthors = bookAuthors;
    }
}
