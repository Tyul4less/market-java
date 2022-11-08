package com.dawon.market.controller;

import com.dawon.market.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping
public class UserController {

    private final UserService userService;


    @GetMapping("/getUser")
    public void userTest(){

        int user = userService.getUser();

        log.info("userMapper.getUser() ={}", user);

    }
}
