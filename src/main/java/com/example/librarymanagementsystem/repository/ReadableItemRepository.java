package com.example.librarymanagementsystem.repository;
import com.example.librarymanagementsystem.model.ReadableItem;

import java.util.*;

public class ReadableItemRepository {
    private final Map<String, ReadableItem> readableItemStore = new HashMap<>();

    public ReadableItem save(ReadableItem item) {
        if (item == null || item.getId() == null)
            throw new IllegalArgumentException("ReadableItem and ID cannot be null");
        readableItemStore.put(item.getId(), item);
        System.out.println("Saved ReadableItem: " + item);
        return item;
    }

    public Optional<ReadableItem> findById(String id) {
        return Optional.ofNullable(readableItemStore.get(id));
    }

    public List<ReadableItem> findAll() {
        return new ArrayList<>(readableItemStore.values());
    }

    public void delete(String id) {
        ReadableItem removed = readableItemStore.remove(id);
        if (removed != null)
            System.out.println("Deleted ReadableItem: " + removed);
        else
            System.out.println("ReadableItem with ID " + id + " not found");
    }
}
