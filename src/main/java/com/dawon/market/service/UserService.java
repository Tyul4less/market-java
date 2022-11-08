package com.dawon.market.service;


import com.dawon.market.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserMapper userMapper;
    public int getUser(){
        return userMapper.getUser();
    }
}
