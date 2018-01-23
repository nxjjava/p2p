package com.p2p.controller;

import com.p2p.service.UserService;
import com.p2p.util.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by 91908 on 2018/1/23.
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/account/login")
    public Response login(String username, String password){
        return userService.login(username,password);
    }
}
