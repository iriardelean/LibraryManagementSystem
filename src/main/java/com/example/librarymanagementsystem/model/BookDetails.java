package com.example.librarymanagementsystem.model;

import java.util.ArrayList;
import java.util.List;

public class BookDetails extends Publication {
    private List<BookAuthor> BookAuthors;

    public BookDetails(String title, String id) {
        super(id, title);
        this.BookAuthors = new ArrayList<>();
    }

    public List<BookAuthor> getBookAuthors() {
        return BookAuthors;
    }

    public void setBookAuthors(List<BookAuthor> bookAuthors) {
        BookAuthors = bookAuthors;
    }
}
