package com.example.librarymanagementsystem.repository;
import com.example.librarymanagementsystem.model.Library;

public class LibraryRepository extends InMemoryRepository<Library, String> {

    public LibraryRepository() {
        super(Library::getId);
    }
}