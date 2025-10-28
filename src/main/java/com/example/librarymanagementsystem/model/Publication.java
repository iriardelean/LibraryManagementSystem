package com.example.librarymanagementsystem.model;

import java.util.List;

public abstract class Publication {
    private String Id;
    private String title;
    private List<String> copies;

    public Publication(String title, List<String> copies, String id) {
        this.title = title;
        this.copies = copies;
        Id = id;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public List<String> getCopies() {
        return copies;
    }

    public void setCopies(List<String> copies) {
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
