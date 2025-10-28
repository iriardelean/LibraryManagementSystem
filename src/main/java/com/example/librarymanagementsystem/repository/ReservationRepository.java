package com.example.librarymanagementsystem.repository;
import com.example.librarymanagementsystem.model.Reservation;

public class ReservationRepository extends InMemoryRepository<Reservation, String> {

    public ReservationRepository() {
        super(Reservation::getId);
    }
}