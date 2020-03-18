package com.xuhao.service;

import com.xuhao.mapper.UserMapper;
import com.xuhao.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public User selectUserByName(String name) {
        return userMapper.selectUserByName(name);
    }
}
