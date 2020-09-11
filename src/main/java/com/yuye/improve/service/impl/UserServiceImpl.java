package com.yuye.improve.service.impl;

import com.yuye.improve.DO.UserDO;
import com.yuye.improve.mapper.UserMapper;
import com.yuye.improve.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhouliang
 * @Date: 2020/9/11 0:07
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDO getUserName(Long userId) {
        return userMapper.selectById(userId);
    }
}
