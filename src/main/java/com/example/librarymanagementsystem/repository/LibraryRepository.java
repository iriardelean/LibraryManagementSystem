package com.example.librarymanagementsystem.repository;
import com.example.librarymanagementsystem.model.Library;

import java.util.*;

public class LibraryRepository {

    private final Map<String, Library> libraryStore = new HashMap<>();


    public Library save(Library library) {
        if (library == null || library.getId() == null)
            throw new IllegalArgumentException("Library and Library ID cannot be null");
        libraryStore.put(library.getId(), library);
        System.out.println("Saved Library: " + library);
        return library;
    }

    public Optional<Library> findById(String id) {
        return Optional.ofNullable(libraryStore.get(id));
    }

    public List<Library> findAll() {
        return new ArrayList<>(libraryStore.values());
    }

    public void delete(String id) {
        Library removed = libraryStore.remove(id);
        if (removed != null)
            System.out.println("Deleted Library: " + removed);
        else
            System.out.println("Library with ID " + id + " not found");
    }
}

