package org.example.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.api.client.UserService;
import org.example.api.dto.UserInfoDTO;

@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public UserInfoDTO getUserInfoById(Long id) {
//        return UserInfoDTO.builder()
//                .userId(1L)
//                .userName("nick")
//                .password("123")
//                .phone("13967578909").build();
        return null;
    }
}