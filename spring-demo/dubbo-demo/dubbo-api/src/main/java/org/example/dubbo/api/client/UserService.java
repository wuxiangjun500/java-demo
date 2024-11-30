package org.example.dubbo.api.client;

import org.example.dubbo.api.dto.UserInfoDTO;

public interface UserService {
    UserInfoDTO getUserInfoById(Long id);
}
