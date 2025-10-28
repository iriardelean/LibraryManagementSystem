package com.example.librarymanagementsystem.repository;
import com.example.librarymanagementsystem.model.Loan;

public class LoanRepository extends InMemoryRepository<Loan, String> {

    public LoanRepository() {
        super(Loan::getId);
    }
}