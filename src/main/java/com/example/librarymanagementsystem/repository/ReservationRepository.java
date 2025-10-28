package com.example.librarymanagementsystem.repository;
import com.example.librarymanagementsystem.model.Reservation;

import java.util.*;

public class ReservationRepository {
    private final Map<String, Reservation> reservationStore = new HashMap<>();

    public Reservation save(Reservation reservation) {
        if (reservation == null || reservation.getId() == null)
            throw new IllegalArgumentException("Reservation and Reservation ID cannot be null");
        reservationStore.put(reservation.getId(), reservation);
        System.out.println("Saved Reservation: " + reservation);
        return reservation;
    }

    public Optional<Reservation> findById(String id) {
        return Optional.ofNullable(reservationStore.get(id));
    }

    public List<Reservation> findAll() {
        return new ArrayList<>(reservationStore.values());
    }

    public void delete(String id) {
        Reservation removed = reservationStore.remove(id);
        if (removed != null)
            System.out.println("Deleted Reservation: " + removed);
        else
            System.out.println("Reservation with ID " + id + " not found");
    }
}
