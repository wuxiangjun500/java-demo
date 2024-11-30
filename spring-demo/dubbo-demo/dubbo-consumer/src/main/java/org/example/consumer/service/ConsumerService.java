package org.example.consumer.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.dubbo.api.client.UserService;
import org.example.dubbo.api.dto.UserInfoDTO;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @DubboReference(scope = "remote")
    public UserService userService;

    public UserInfoDTO getUser() {
        return userService.getUserInfoById(1L);
    }

}
