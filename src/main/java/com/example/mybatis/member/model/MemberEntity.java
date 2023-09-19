package com.example.mybatis.member.model;

import com.example.mybatis.common.model.BaseEitity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "members")
@Getter
@NoArgsConstructor
public class MemberEntity extends BaseEitity {
    @Id@GeneratedValue
    private Long id;

    private String name;
    private String email;
    @Builder
    private MemberEntity(String name, String email) {
        this.name = name;
        this.email = email;
    }

}
