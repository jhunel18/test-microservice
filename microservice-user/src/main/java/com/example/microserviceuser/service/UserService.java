package com.example.microserviceuser.service;

import com.example.microserviceuser.dto.ResponseDto;
import com.example.microserviceuser.entity.User;

public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}
