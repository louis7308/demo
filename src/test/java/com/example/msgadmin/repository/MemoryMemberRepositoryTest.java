package com.example.msgadmin.repository;

import com.example.msgadmin.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MemoryMemberRepositoryTest {

    MemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save() {
        Member testMember = new Member();
        testMember.setName("spring");
        repository.save(testMember);

        Member result = repository.findById(testMember.getId()).get();
        System.out.println("result : " + result);
        System.out.println("testMemeber Get Id" + testMember);

        Assertions.assertThat(testMember).isEqualTo(result);
    }

    @Test
    public void Test() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();

        Assertions.assertThat(result).isEqualTo(member1);
    }
}
