package com.base.service;

import com.base.orm.mybatis.bean.User;
import com.base.orm.mybatis.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by guoshijie on 16/1/22.
 */
public interface UserService {

    public User getUserById(String userId);

}
