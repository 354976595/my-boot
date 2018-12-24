package com.example.myboot.controller;

import com.example.myboot.model.UserInfo;
import com.example.myboot.service.UserService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransActionController {
    @Autowired
    private UserService userService;
    @RequestMapping("/transActionTest")
    public String transTest() {
        int updateCount;
        try {
            UserInfo userInfo = userService.getByPrimaryKey(1);
            userInfo.setName("修改后");
            updateCount = userService.updateByPrimaryKey(userInfo);
        } catch (Exception e) {
            return e.getMessage();
        }
        return updateCount + "";
    }
}
