package com.yjn.service;

import com.yjn.pojo.User;
import com.yjn.pojo.UserBean;

import java.util.List;

public interface IUserService {
    List<User> selectAllUser();
    UserBean selectUserById(Integer id);
}
