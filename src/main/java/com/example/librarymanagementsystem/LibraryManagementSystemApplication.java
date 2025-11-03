package com.example.librarymanagementsystem;

import com.example.librarymanagementsystem.controller.BookDetailsController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementSystemApplication.class, args);
    }

    // Demo: call the controller directly on startup and print its response
    @Bean
    public CommandLineRunner demo(BookDetailsController bookDetailsController) {
        return args -> {
            String result = bookDetailsController.sayBookDetails();
            System.out.println("[Startup demo] BookDetailsController response: " + result);
        };
    }

}
