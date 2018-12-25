package com.example.myboot.controller;

import com.example.myboot.model.UserInfo;
import com.example.myboot.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWordController {
    @Autowired
    private UserService userService;
    @RequestMapping("/hello")
    public String hello(Object test,Object ws,UserInfo userInfo){
        List<UserInfo> res=null;
        try {
            res = userService.getAll();
            System.out.println(res.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "hey  hello";
    }
}
