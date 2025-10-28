package com.example.librarymanagementsystem.repository;
import com.example.librarymanagementsystem.model.Member;

import java.util.*;

public class MemberRepository {
    private final Map<String, Member> memberStore = new HashMap<>();

    public Member save(Member member) {
        if (member == null || member.getId() == null)
            throw new IllegalArgumentException("Member and Member ID cannot be null");
        memberStore.put(member.getId(), member);
        System.out.println("Saved Member: " + member);
        return member;
    }

    public Optional<Member> findById(String id) {
        return Optional.ofNullable(memberStore.get(id));
    }

    public List<Member> findAll() {
        return new ArrayList<>(memberStore.values());
    }

    public void delete(String id) {
        Member removed = memberStore.remove(id);
        if (removed != null)
            System.out.println("Deleted Member: " + removed);
        else
            System.out.println("Member with ID " + id + " not found");
    }
}
