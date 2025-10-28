package com.example.librarymanagementsystem.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
