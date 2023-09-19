package com.example.mybatis.member.service;

import com.example.mybatis.member.dto.MemberDto;
import com.example.mybatis.member.model.MemberEntity;
import com.example.mybatis.member.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class MemberServiceTest {
    @Autowired
    MemberRepository memberRepository;

    @Test
    void searchMember(){
        /*given*/
        MemberEntity member1 = MemberEntity.builder().name("jane").email("jane@gmail.com").build();
        MemberEntity member2 = MemberEntity.builder().name("mike").email("mike@gmail.com").build();
        memberRepository.save(member1);
        memberRepository.save(member2);

        /*when*/
        List<MemberEntity> result = memberRepository.findAll();

        /*then*/
        assertThat(result.size()).isEqualTo(2);
    }


}