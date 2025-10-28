package com.example.librarymanagementsystem.repository;
import com.example.librarymanagementsystem.model.ReadableItem;

public class ReadableItemRepository extends InMemoryRepository<ReadableItem, String> {

    public ReadableItemRepository() {
        super(ReadableItem::getId);
    }
}