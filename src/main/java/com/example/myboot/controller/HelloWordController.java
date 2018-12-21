package com.example.myboot.controller;

import com.example.myboot.model.UserInfo;
import com.example.myboot.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    @Autowired
    private UserService userService;
    @RequestMapping("/hello")
    public String hello(UserInfo userInfo,Object sv){
        UserInfo res=null;
        try {
            res = userService.getAll(1);
            System.out.println(res.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "hey  hello";
    }
}
