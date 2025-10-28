package com.example.librarymanagementsystem.repository;
import com.example.librarymanagementsystem.model.Loan;

import java.util.*;

public class LoanRepository {
    private final Map<String, Loan> loanStore = new HashMap<>();

    public Loan save(Loan loan) {
        if (loan == null || loan.getId() == null)
            throw new IllegalArgumentException("Loan and Loan ID cannot be null");
        loanStore.put(loan.getId(), loan);
        System.out.println("Saved Loan: " + loan);
        return loan;
    }

    public Optional<Loan> findById(String id) {
        return Optional.ofNullable(loanStore.get(id));
    }

    public List<Loan> findAll() {
        return new ArrayList<>(loanStore.values());
    }

    public void delete(String id) {
        Loan removed = loanStore.remove(id);
        if (removed != null)
            System.out.println("Deleted Loan: " + removed);
        else
            System.out.println("Loan with ID " + id + " not found");
    }
}
