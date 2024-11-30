package org.example.dubbo.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDTO implements Serializable {
    private Long userId;
    private String userName;
    private String password;
    private String phone;
}
