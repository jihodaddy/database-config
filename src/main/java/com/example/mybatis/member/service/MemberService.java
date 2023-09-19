package com.example.mybatis.member.service;

import com.example.mybatis.dao.BaseDao;
import com.example.mybatis.member.dto.MemberDto;
import com.example.mybatis.member.model.MemberEntity;
import com.example.mybatis.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private BaseDao baseDao;

    public List<MemberEntity> search(){
        return memberRepository.findAll();
    }

    public void insert(MemberEntity entity) {
        memberRepository.save(entity);
    }

    public List<MemberDto> selectMembers() {
        return baseDao.selectList("mapper.common.selectMember");
    }

    public void saveMembers() {
        MemberEntity member1 = MemberEntity.builder().name("jane").email("jane@gmail.com").build();
        MemberEntity member2 = MemberEntity.builder().name("mike").email("mike@gmail.com").build();
        memberRepository.save(member1);
        memberRepository.save(member2);
    }
}
