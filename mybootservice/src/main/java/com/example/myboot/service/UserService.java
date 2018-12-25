package com.example.myboot.service;

import com.example.myboot.model.UserInfo;

import java.util.List;

public interface UserService {
    UserInfo getByPrimaryKey(Integer integer);
    int updateByPrimaryKey(UserInfo userInfo);

    List<UserInfo> getAll();
}
