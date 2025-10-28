package com.example.librarymanagementsystem.repository;

import com.example.librarymanagementsystem.model.Publication;

public class PublicationRepository extends InMemoryRepository<Publication, String> {

    public PublicationRepository() {
        super(Publication::getId);
    }
}