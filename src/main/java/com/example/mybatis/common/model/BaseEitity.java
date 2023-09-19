package com.example.mybatis.common.model;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public class BaseEitity {

    private String createUserId;

    @CreatedDate
    private LocalDateTime createDate;

    private String updateUserId;

    @LastModifiedDate
    private LocalDateTime updateDate;
}
