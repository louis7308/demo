package com.example.msgadmin.repository;

import com.example.msgadmin.domain.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MemoryMemberRepositoryTest {

    MemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save() {
        Member testMember = new Member();
        testMember.setName("spring");

        repository.save(testMember);

        Member result = repository.findById(testMember.getId()).get();
        Assertions.assertEquals(testMember, result);
    }
}
