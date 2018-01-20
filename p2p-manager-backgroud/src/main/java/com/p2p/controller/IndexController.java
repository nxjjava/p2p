package com.p2p.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 91908 on 2018/1/18.
 */
@RestController
public class IndexController {
    @RequestMapping("/")
    public String showIndex(){
        return "hello world !!!";
    }
}
