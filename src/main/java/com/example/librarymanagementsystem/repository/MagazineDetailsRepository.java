package com.example.librarymanagementsystem.repository;

import com.example.librarymanagementsystem.model.MagazineDetails;

public class MagazineDetailsRepository extends InMemoryRepository<MagazineDetails, String>{

    public MagazineDetailsRepository() {
        super(MagazineDetails::getId);
    }
}
