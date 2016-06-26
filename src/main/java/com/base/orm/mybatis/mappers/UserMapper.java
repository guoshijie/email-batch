package com.base.orm.mybatis.mappers;


import com.base.orm.mybatis.bean.User;
import org.springframework.stereotype.Repository;
import java.util.Map;

@Repository
public interface UserMapper {

    Map getUserById(Integer id);
}