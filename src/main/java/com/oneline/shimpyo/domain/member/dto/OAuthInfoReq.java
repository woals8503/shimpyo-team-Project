package com.oneline.shimpyo.domain.member.dto;

import lombok.Data;

@Data
public class OAuthInfoReq {
    private String phoneNumber;
    private String nickname;
    private Long id;
}
