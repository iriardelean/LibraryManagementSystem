package com.example.librarymanagementsystem.service;

import com.example.librarymanagementsystem.model.Member;
import com.example.librarymanagementsystem.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository repository;

    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    public MemberService() {
        this(new MemberRepository());
    }

    public Member create(Member entity) {
        if (entity == null)
            throw new IllegalArgumentException("Member cannot be null");
        return repository.save(entity);
    }

    public Optional<Member> findById(String id) {
        return repository.findById(id);
    }

    public List<Member> findAll() {
        return repository.findAll();
    }

    public Member update(Member entity) {
        if (entity == null || entity.getId() == null)
            throw new IllegalArgumentException("Member and Id cannot be null");
        return repository.save(entity);
    }

    public void delete(String id) {
        repository.delete(id);
    }
}

