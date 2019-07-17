package com.yjn.service.impl;

import com.yjn.mapper.UserBeanMapper;
import com.yjn.mapper.UserMapper;
import com.yjn.pojo.User;
import com.yjn.pojo.UserBean;
import com.yjn.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserBeanMapper userbeanMapper;

    @Override
    public List<User> selectAllUser(){
        return userMapper.selectAll();
    }

    @Override
    public UserBean selectUserById(Integer id) {
        return userbeanMapper.selectByPrimaryKey(id);
    }
}
