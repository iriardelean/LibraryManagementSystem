package com.example.librarymanagementsystem.repository;

import com.example.librarymanagementsystem.model.BookDetails;

public class BookDetailsRepository extends InMemoryRepository<BookDetails, String>{

    public BookDetailsRepository() {
        super(BookDetails::getId);
    }
}
