package com.example.librarymanagementsystem.model;

import java.util.List;

public class Member {
    private String Id;
    private String Name;
    private String LibraryId;
    private List<Reservation> reservetions;
    private List<Loan> loans;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLibraryId() {
        return LibraryId;
    }

    public void setLibraryId(String libraryId) {
        LibraryId = libraryId;
    }

    public List<Reservation> getReservetions() {
        return reservetions;
    }

    public void setReservetions(List<Reservation> reservetions) {
        this.reservetions = reservetions;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public Member(String id, String name, String libraryId, List<Reservation> reservetions, List<Loan> loans) {
        Id = id;
        Name = name;
        LibraryId = libraryId;
        this.reservetions = reservetions;
        this.loans = loans;
    }

}
