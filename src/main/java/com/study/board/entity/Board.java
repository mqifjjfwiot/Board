package com.study.board.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long member_idx; // PK

    private String member_nm; // 이름

    private String member_pw; // 비밀번호

    private String member_phone; // 전화번호

    private String member_email; // 이메일

    private LocalDateTime regdt = LocalDateTime.now(); // 생성일

    private LocalDateTime chgdt; // 수정일

    @Builder
    public Board(String member_nm, String member_pw, String member_phone, String member_email) {
        this.member_nm = member_nm;
        this.member_pw = member_pw;
        this.member_phone = member_phone;
        this.member_email = member_email;
    }

}