package com.example.librarymanagementsystem.model;

public class MagazineDetails extends Publication {
    private String Publisher;

    public MagazineDetails(String title, String id, String Publisher) {
        super(id, title);
        this.Publisher = Publisher;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }
}
