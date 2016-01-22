package com.base.service.impl;

import com.base.orm.mybatis.bean.User;
import com.base.orm.mybatis.mappers.UserMapper;
import com.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

/**
 * Created by guoshijie on 16/1/22.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;

    public User getUserById(String userId) {
        if(!StringUtils.isEmpty(userId)){
            User user = userMapper.selectByPrimaryKey(Integer.parseInt(userId));
            return user;
        }
        return null;
    }

}
