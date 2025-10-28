package com.example.librarymanagementsystem.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @Controller
    public static class BookDetailsController {

        @GetMapping("/bookdetails")
        @ResponseBody
        public String sayBookDetails() {
            return "Die Anwendung funktioniert! (BookDetails)";
        }
    }
}
