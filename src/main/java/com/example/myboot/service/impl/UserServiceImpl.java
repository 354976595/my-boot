package com.example.myboot.service.impl;

import com.example.myboot.mapper.UserInfoMapper;
import com.example.myboot.model.UserInfo;
import com.example.myboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public UserInfo getAll(Integer integer) {
        return userInfoMapper.selectByPrimaryKey(integer);
    }
}
