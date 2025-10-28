package com.example.librarymanagementsystem.repository;

import com.example.librarymanagementsystem.model.Member;

public class MemberRepository extends InMemoryRepository<Member, String> {

    public MemberRepository() {
        super(Member::getId);
    }
}