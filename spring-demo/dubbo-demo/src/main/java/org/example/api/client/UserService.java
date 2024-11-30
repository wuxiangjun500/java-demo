package org.example.api.client;

import org.example.api.dto.UserInfoDTO;

public interface UserService {
    UserInfoDTO getUserInfoById(Long id);
}
