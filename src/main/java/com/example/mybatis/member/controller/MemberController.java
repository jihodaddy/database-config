package com.example.mybatis.member.controller;

import com.example.mybatis.member.dto.MemberDto;
import com.example.mybatis.member.model.MemberEntity;
import com.example.mybatis.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("members")
    public List<MemberDto> search(){
        return memberService.selectMembers();
    }

}
