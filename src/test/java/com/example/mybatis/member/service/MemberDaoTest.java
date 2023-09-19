package com.example.mybatis.member.service;


import com.example.mybatis.member.dto.MemberDto;
import com.example.mybatis.member.model.MemberEntity;
import com.example.mybatis.member.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MemberDaoTest {

    @Autowired
    MemberRepository memberRepository;
    @Autowired
    MemberService memberService;

    @Test
    void selectMember(){
        /*given*/
        MemberEntity member1 = MemberEntity.builder().name("jane").email("jane@gmail.com").build();
        MemberEntity member2 = MemberEntity.builder().name("mike").email("mike@gmail.com").build();
        memberRepository.save(member1);
        memberRepository.save(member2);

        /*when*/
        List<MemberDto> result = memberService.selectMembers();

        /*then*/
        assertThat(result.size()).isEqualTo(2);
    }
}
