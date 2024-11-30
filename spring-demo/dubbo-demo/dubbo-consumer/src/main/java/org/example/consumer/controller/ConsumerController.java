package org.example.consumer.controller;

import jakarta.annotation.Resource;
import org.example.consumer.service.ConsumerService;
import org.example.dubbo.api.dto.UserInfoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ConsumerController {

    @Resource
    private ConsumerService consumerService;

    @GetMapping("/get/user")
    public UserInfoDTO getUser() {
       return consumerService.getUser();
    }

}
