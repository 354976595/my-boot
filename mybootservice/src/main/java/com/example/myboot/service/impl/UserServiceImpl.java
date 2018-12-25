package com.example.myboot.service.impl;

import com.example.myboot.mapper.UserInfoMapper;
import com.example.myboot.model.UserInfo;
import com.example.myboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * @author xjd
 */
@Service
@Transactional(readOnly = true,rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    @Transactional(readOnly = true)
    public UserInfo getByPrimaryKey(Integer integer) {
        return userInfoMapper.selectByPrimaryKey(integer);
    }

    @Override
    @Transactional(readOnly = false,rollbackFor = Exception.class)
    public int updateByPrimaryKey(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKey(userInfo);
        return 0;
    }

    @Override
    @Transactional(readOnly = true)
    public List<UserInfo> getAll() {
        return userInfoMapper.selectAll();
    }
}
