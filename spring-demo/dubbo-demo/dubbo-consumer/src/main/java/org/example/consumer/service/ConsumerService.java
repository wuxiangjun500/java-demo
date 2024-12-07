package org.example.consumer.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.dubbo.api.client.UserService;
import org.example.dubbo.api.dto.UserInfoDTO;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    // 必须指定服务名，如果没有metadata的话
    @DubboReference(providedBy = "dubbo-producer", retries = 0, timeout = 1000)
    public UserService userService;

    public UserInfoDTO getUser() {
        return userService.getUserInfoById(1L);
    }

}
